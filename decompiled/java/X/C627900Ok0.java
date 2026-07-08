package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.awemeservice.api.IRequestIdService;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.creativedetail.datamodel.CreativeToolDetailListModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS195S0000000_9;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Ok0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C627900Ok0 extends AbstractC1255880imo<Aweme, CreativeToolDetailListModel> {
    public final EnumC627880Ojy LL;
    public final HashSet<String> LLILLJJLI = new HashSet<>();
    public final ArrayList<Aweme> LLILLL = new ArrayList<>();
    public boolean LLILZ = true;
    public final C01GW LLILZIL = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(488));
    public long LLILZLL = System.currentTimeMillis();
    public long LLIZ = System.currentTimeMillis();
    public Integer LLIZLLLIL;
    public String LLJ;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC1255880imo
    public final List<Aweme> getItems() {
        T t = this.mData;
        if (t == 0 || ((CreativeToolDetailListModel) t).LJ().isEmpty()) {
            return null;
        }
        return ((CreativeToolDetailListModel) this.mData).LJ();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC1255880imo
    public final boolean isDataEmpty() {
        T t = this.mData;
        return (t == 0 || ((CreativeToolDetailListModel) t).hasMore == 0) && C086I.LIZIZ(getItems());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC1255880imo
    public final boolean isHasMore() {
        T t = this.mData;
        return t != 0 && ((CreativeToolDetailListModel) t).hasMore == 1;
    }

    public C627900Ok0(EnumC627880Ojy enumC627880Ojy) {
        this.LL = enumC627880Ojy;
    }

    @Override // X.AbstractC666100QAu
    public final boolean checkParams(Object... objArr) {
        if (objArr.length >= 4) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC1255880imo
    public final boolean deleteItem(Aweme aweme) {
        Aweme aweme2 = aweme;
        boolean zLIZIZ = C729980SkG.LIZIZ(getItems(), aweme2, this.mNotifyListeners);
        ArrayList<Aweme> arrayList = ((CreativeToolDetailListModel) this.mData).awemeList;
        if (arrayList != null) {
            C19719612Di.LJJIIJ(arrayList, new C5183020f(aweme2, 223), true);
        }
        ArrayList<Aweme> arrayList2 = ((CreativeToolDetailListModel) this.mData).topAwemeList;
        if (arrayList2 != null) {
            C19719612Di.LJJIIJ(arrayList2, new C5183020f(aweme2, 224), true);
        }
        C19719612Di.LJJIIJ(this.LLILLL, new C5183020f(aweme2, 225), true);
        return zLIZIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, com.ss.android.ugc.aweme.base.api.BaseResponse, com.ss.android.ugc.aweme.creativedetail.datamodel.CreativeToolDetailListModel] */
    @Override // X.AbstractC666100QAu
    public final void handleData(Object obj) {
        ArrayList<Aweme> arrayListLJ;
        boolean z;
        String str;
        ArrayList<Aweme> arrayList;
        Iterator<Aweme> it2;
        int iIntValue;
        int iIntValue2;
        ArrayList<Aweme> arrayList2;
        Aweme awemeLLILLL;
        String aid;
        String str2;
        ?? r2 = (CreativeToolDetailListModel) obj;
        String str3 = null;
        if (r2 != 0) {
            arrayListLJ = r2.LJ();
        } else {
            arrayListLJ = null;
        }
        int iIntValue3 = 0;
        if (r2 != 0 && arrayListLJ != null && !arrayListLJ.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        this.mIsNewDataEmpty = z;
        String str4 = "";
        if (!z && arrayListLJ != null) {
            int size = arrayListLJ.size();
            for (int i = 0; i < size; i++) {
                Aweme aweme = (Aweme) ListProtector.get(arrayListLJ, i);
                IAwemeService iAwemeService = (IAwemeService) PluggableExtentionKt.pluggableSpi$default(IAwemeService.class, false, false, false, 14, null);
                if (iAwemeService != null) {
                    awemeLLILLL = iAwemeService.LLILLL(aweme);
                } else {
                    awemeLLILLL = null;
                }
                IRequestIdService iRequestIdService = (IRequestIdService) PluggableExtentionKt.pluggableSpi$default(IRequestIdService.class, false, false, false, 14, null);
                if (iRequestIdService != null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    if (awemeLLILLL != null) {
                        aid = awemeLLILLL.getAid();
                    } else {
                        aid = null;
                    }
                    sbLIZ.append(aid);
                    int i2 = C627890Ojz.LIZ[this.LL.ordinal()];
                    if (i2 != 1) {
                        if (i2 == 2) {
                            str2 = "28055";
                        } else {
                            throw new C1954807lC();
                        }
                    } else {
                        str2 = "27054";
                    }
                    sbLIZ.append(str2);
                    iRequestIdService.LIZIZ(i, C2188811AlT.LIZIZ(sbLIZ), r2.getRequestId());
                }
                if (awemeLLILLL != null) {
                    ListProtector.set(arrayListLJ, i, awemeLLILLL);
                }
            }
            ArrayList<Aweme> arrayList3 = r2.awemeList;
            if ((arrayList3 == null || !arrayList3.isEmpty()) && (arrayList = r2.awemeList) != null && (it2 = arrayList.iterator()) != null) {
                while (it2.hasNext()) {
                    Aweme next = it2.next();
                    if (next.getAid() != null && !this.LLILLJJLI.contains(next.getAid())) {
                        this.LLILLJJLI.add(next.getAid());
                    } else {
                        it2.remove();
                    }
                }
            }
            int i3 = this.mListQueryType;
            if (i3 != 1) {
                if (i3 == 4) {
                    ArrayList<Aweme> arrayList4 = r2.awemeList;
                    if (arrayList4 != null && (arrayList2 = ((CreativeToolDetailListModel) this.mData).awemeList) != null) {
                        arrayList2.addAll(arrayList4);
                    }
                    CreativeToolDetailListModel creativeToolDetailListModel = (CreativeToolDetailListModel) this.mData;
                    creativeToolDetailListModel.cursor = r2.cursor;
                    creativeToolDetailListModel.hasMore = r2.hasMore;
                    creativeToolDetailListModel.pageExtra = r2.pageExtra;
                    Integer num = this.LLIZLLLIL;
                    if (num != null) {
                        iIntValue2 = num.intValue();
                    } else {
                        iIntValue2 = 0;
                    }
                    String str5 = this.LLJ;
                    if (str5 != null) {
                        str4 = str5;
                    }
                    long j = this.LLIZ;
                    long j2 = this.LLILZLL;
                    getClass();
                    LJIIJJI(iIntValue2, str4, j, j2, false, null, null, null);
                    return;
                }
                return;
            }
            this.mData = r2;
            this.LLILLL.clear();
            ArrayList<Aweme> arrayList5 = r2.topAwemeList;
            if (arrayList5 != null) {
                this.LLILLL.addAll(arrayList5);
            }
            Integer num2 = this.LLIZLLLIL;
            if (num2 != null) {
                iIntValue = num2.intValue();
            } else {
                iIntValue = 0;
            }
            String str6 = this.LLJ;
            if (str6 != null) {
                str4 = str6;
            }
            long j3 = this.LLIZ;
            long j4 = this.LLILZLL;
            boolean z2 = this.LLILZ;
            getClass();
            LJIIJJI(iIntValue, str4, j3, j4, z2, null, null, null);
            this.LLILZ = false;
            return;
        }
        Integer num3 = this.LLIZLLLIL;
        if (num3 != null) {
            iIntValue3 = num3.intValue();
        }
        String str7 = this.LLJ;
        if (str7 != null) {
            str4 = str7;
        }
        long j5 = this.LLIZ;
        long j6 = this.LLILZLL;
        if (r2 != 0) {
            str = r2.message;
            BaseResponse.ServerTimeExtra serverTimeExtra = r2.extra;
            if (serverTimeExtra != null) {
                str3 = serverTimeExtra.logid;
            }
        } else {
            str = null;
        }
        LJIIJJI(iIntValue3, str4, j5, j6, false, "List", str, str3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC1255880imo
    public final void loadMoreList(Object... objArr) {
        long jCurrentTimeMillis;
        long j;
        Long l;
        int iIntValue = ((Integer) objArr[1]).intValue();
        String str = (String) objArr[2];
        Object obj = objArr[3];
        if ((obj instanceof Long) && (l = (Long) obj) != null) {
            jCurrentTimeMillis = l.longValue();
        } else {
            jCurrentTimeMillis = System.currentTimeMillis();
        }
        if (isDataEmpty()) {
            j = 0;
        } else {
            j = ((CreativeToolDetailListModel) this.mData).cursor;
        }
        LJIIJ(iIntValue, jCurrentTimeMillis, j, str);
    }

    @Override // X.AbstractC1255880imo
    public final void refreshList(Object... objArr) {
        long jCurrentTimeMillis;
        Long l;
        this.LLILLJJLI.clear();
        int iIntValue = ((Integer) objArr[1]).intValue();
        String str = (String) objArr[2];
        Object obj = objArr[3];
        if ((obj instanceof Long) && (l = (Long) obj) != null) {
            jCurrentTimeMillis = l.longValue();
        } else {
            jCurrentTimeMillis = System.currentTimeMillis();
        }
        LJIIJ(iIntValue, jCurrentTimeMillis, 0L, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v9, types: [T, com.ss.android.ugc.aweme.creativedetail.datamodel.CreativeToolDetailListModel] */
    @Override // X.AbstractC1255880imo
    public final void setItems(List<Aweme> list) {
        if (this.mData == 0) {
            this.mData = new CreativeToolDetailListModel();
        }
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (Aweme aweme : list) {
                Aweme aweme2 = aweme;
                Iterator<Aweme> it2 = this.LLILLL.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (Intrinsics.LJFF(aweme2.getAid(), it2.next().getAid())) {
                            break;
                        }
                    } else {
                        arrayList.add(aweme);
                        break;
                    }
                }
            }
            ((CreativeToolDetailListModel) this.mData).awemeList = C09HN.LIZ(arrayList);
        }
    }

    public final void LJIIJ(int i, long j, long j2, String str) {
        this.LLIZLLLIL = Integer.valueOf(i);
        this.LLJ = str;
        this.LLIZ = j;
        this.LLILZLL = System.currentTimeMillis();
        C23250099c.LIZLLL((InterfaceC497601wk) this.LLILZIL.getValue(), null, null, new C627910Ok1(i, str, j2, this, j, null), 3);
    }

    public static void LJIIJJI(int i, String str, long j, long j2, boolean z, String str2, String str3, String str4) {
        int i2;
        try {
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ(Scene.SCENE_SERVICE, String.valueOf(i));
            c2344009Gk.LJIIIIZZ("third_id", str);
            c2344009Gk.LIZLLL(System.currentTimeMillis() - j2, "cost");
            c2344009Gk.LIZLLL(System.currentTimeMillis() - j, "total_cost");
            c2344009Gk.LJIIIIZZ("cost_type", "List");
            if (z) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            c2344009Gk.LIZJ(i2, "is_list_first_load");
            c2344009Gk.LJIIIIZZ("error_stage", str2);
            c2344009Gk.LJIIIIZZ("error_msg", str3);
            c2344009Gk.LJIIIIZZ("log_id", str4);
            C20684815ws.LJIILLIIL("creative_tool_anchor_detail_page", c2344009Gk.LIZ);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }
}
