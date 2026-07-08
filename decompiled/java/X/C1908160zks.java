package X;

import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.notification.UserListActivity;
import com.ss.android.ugc.aweme.notification.bean.DiggInfo;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.AFwS271S0000000_28;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0zks, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1908160zks extends AbstractC683590Qrd<DiggInfo> {
    public final InterfaceC1363370laB LL;
    public final String LLILLJJLI;
    public int LLILLL;
    public final Context LLILZ;
    public final C1908250zl1 LLILZIL;
    public UrlModel LLILZLL;
    public String LLIZ;
    public String LLIZLLLIL;
    public Function0<Unit> LLJ;
    public boolean LLJI;
    public boolean LLJIJIL;
    public final Map<String, Boolean> LLJILJIL;
    public final Map<String, C894700Z8a> LLJILJILJ;

    public final void LLLI(C595660NXw c595660NXw) {
        List<DiggInfo> data;
        String uid;
        if (c595660NXw == null || (data = getData()) == null) {
            return;
        }
        this.LLJILJIL.put(c595660NXw.LIZ, Boolean.valueOf(C896480ZEw.LIZJ(c595660NXw)));
        this.LLJILJILJ.put(c595660NXw.LIZ, C896480ZEw.LIZ(c595660NXw, this.LLILZ, 2));
        Iterator<DiggInfo> it2 = data.iterator();
        int i = 0;
        while (it2.hasNext()) {
            User user = it2.next().user;
            if (user != null) {
                uid = user.getUid();
            } else {
                uid = null;
            }
            if (Intrinsics.LJFF(uid, c595660NXw.LIZ)) {
                if (i >= 0) {
                    notifyItemChanged(i);
                    return;
                }
                return;
            }
            i++;
        }
    }

    @Override // X.AbstractC683590Qrd
    public final void addData(List<? extends DiggInfo> list) {
        ArrayList arrayList;
        if (list != null) {
            arrayList = new ArrayList(list);
        } else {
            arrayList = null;
        }
        super.addData(LLLFZ(arrayList, true));
    }

    @Override // X.AbstractC438050HFr
    public final int getBasicItemViewType(int i) {
        User user;
        DiggInfo diggInfo;
        DiggInfo diggInfo2;
        List<DiggInfo> data = getData();
        User user2 = null;
        if (data != null && (diggInfo2 = (DiggInfo) ListProtector.get(data, i)) != null) {
            user = diggInfo2.user;
        } else {
            user = null;
        }
        if (user instanceof C1908230zkz) {
            return 15;
        }
        List<DiggInfo> data2 = getData();
        if (data2 != null && (diggInfo = (DiggInfo) ListProtector.get(data2, i)) != null) {
            user2 = diggInfo.user;
        }
        if (user2 instanceof C1908210zkx) {
            return 14;
        }
        return super.getBasicItemViewType(i);
    }

    @Override // X.AbstractC683510QrV, X.AbstractC21673619ry
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        ViewOnClickListenerC1908150zkr viewOnClickListenerC1908150zkr;
        User user;
        UserListActivity userListActivity;
        User user2;
        super.onViewAttachedToWindow(viewHolder);
        String uid = null;
        if ((viewHolder instanceof ViewOnClickListenerC1908150zkr) && (viewOnClickListenerC1908150zkr = (ViewOnClickListenerC1908150zkr) viewHolder) != null) {
            Context context = viewOnClickListenerC1908150zkr.itemView.getContext();
            if ((context instanceof UserListActivity) && (userListActivity = (UserListActivity) context) != null) {
                int adapterPosition = viewOnClickListenerC1908150zkr.getAdapterPosition();
                DiggInfo diggInfo = viewOnClickListenerC1908150zkr.LLJ;
                if (diggInfo != null) {
                    user2 = diggInfo.user;
                } else {
                    user2 = null;
                }
                userListActivity.LLZ(adapterPosition, user2, "show");
            }
            ViewOnClickListenerC1908150zkr viewOnClickListenerC1908150zkr2 = (ViewOnClickListenerC1908150zkr) viewHolder;
            DiggInfo diggInfo2 = viewOnClickListenerC1908150zkr2.LLJ;
            if (diggInfo2 != null && (user = diggInfo2.user) != null) {
                uid = user.getUid();
            }
            if (!C10EU.LJIIZILJ(uid)) {
                C897490ZIt.LIZLLL(viewOnClickListenerC1908150zkr2.LLJIJIL);
            }
        }
        AFwS271S0000000_28 aFwS271S0000000_28 = AFwS271S0000000_28.get$arr$(252);
        C1908260zl2 c1908260zl2 = C1908300zl6.LIZ;
        if (c1908260zl2 != null) {
            aFwS271S0000000_28.invoke(c1908260zl2);
        }
    }

    @Override // X.AbstractC683590Qrd
    public final void setData(List<DiggInfo> list) {
        List<DiggInfo> listLLLFZ = LLLFZ(list, false);
        if (this.LLJI) {
            DiggInfo diggInfo = new DiggInfo();
            diggInfo.user = new User() { // from class: X.0zkz
                public static final int $stable = 8;
            };
            ListProtector.add(listLLLFZ, 0, diggInfo);
        }
        super.setData(listLLLFZ);
    }

    public final List<DiggInfo> LLLFZ(List<DiggInfo> list, boolean z) {
        int i;
        boolean z2;
        User user;
        C1908210zkx c1908210zkx;
        User user2;
        C1908210zkx c1908210zkx2;
        if (!this.LLJIJIL) {
            if (list != null) {
                return list;
            }
            return new ArrayList();
        }
        if (this.LLILLL == 0) {
            if (list != null) {
                return list;
            }
            return new ArrayList();
        }
        if (list != null && !list.isEmpty()) {
            List data = getData();
            if (data == null) {
                data = new ArrayList();
            }
            ArrayList arrayList = new ArrayList();
            Iterator<Object> it2 = new C1939607ik(data).iterator();
            while (true) {
                if (it2.hasNext()) {
                    DiggInfo diggInfo = (DiggInfo) it2.next();
                    if (diggInfo != null) {
                        user2 = diggInfo.user;
                    } else {
                        user2 = null;
                    }
                    if ((user2 instanceof C1908210zkx) && (c1908210zkx2 = (C1908210zkx) user2) != null && c1908210zkx2.getType() == 0) {
                        i = 1;
                        break;
                    }
                } else {
                    i = 0;
                    break;
                }
            }
            Iterator<Object> it3 = new C1939607ik(data).iterator();
            while (true) {
                if (it3.hasNext()) {
                    DiggInfo diggInfo2 = (DiggInfo) it3.next();
                    if (diggInfo2 != null) {
                        user = diggInfo2.user;
                    } else {
                        user = null;
                    }
                    if ((user instanceof C1908210zkx) && (c1908210zkx = (C1908210zkx) user) != null && c1908210zkx.getType() == 1) {
                        z2 = true;
                        break;
                    }
                } else {
                    z2 = false;
                    break;
                }
            }
            C1908180zku c1908180zku = new C1908180zku(data, this, i, list, arrayList);
            if (z) {
                if (i != 0) {
                    if (!z2 && data.size() + list.size() >= this.LLILLL + 1) {
                        c1908180zku.invoke();
                    } else {
                        arrayList.addAll(list);
                        return arrayList;
                    }
                }
                return arrayList;
            }
            if (i == 0) {
                C1908210zkx c1908210zkx3 = new C1908210zkx(0);
                DiggInfo diggInfo3 = new DiggInfo();
                diggInfo3.user = c1908210zkx3;
                arrayList.add(diggInfo3);
            }
            c1908180zku.invoke();
            return arrayList;
        }
        return new ArrayList();
    }

    /* JADX WARN: Removed duplicated region for block: B:145:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x050f  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x051b  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0524  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0531  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x053f  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x055d  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0561  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0598  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x05a8  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x05af  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x05b5  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x05b8  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x05ba  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x05bd  */
    @Override // X.AbstractC438050HFr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindBasicViewHolder(androidx.recyclerview.widget.RecyclerView.ViewHolder r36, int r37) {
        /*
            Method dump skipped, instruction units count: 1645
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1908160zks.onBindBasicViewHolder(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
    }

    @Override // X.AbstractC438050HFr
    public final RecyclerView.ViewHolder onCreateBasicViewHolder(ViewGroup viewGroup, int i) {
        if (i != 14) {
            if (i != 15) {
                return new ViewOnClickListenerC1908150zkr(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.aah, viewGroup, false));
            }
            return new C1908110zkn(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.a_s, viewGroup, false), this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ);
        }
        return new C1908190zkv(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.aat, viewGroup, false));
    }

    public C1908160zks(UserListActivity userListActivity, String str, UserListActivity userListActivity2, C1908250zl1 c1908250zl1) {
        super(false);
        this.LL = userListActivity;
        this.LLILLJJLI = str;
        this.LLILLL = 0;
        this.LLILZ = userListActivity2;
        this.LLILZIL = c1908250zl1;
        setLoadEmptyText(2131835751);
        this.LLJ = AFwS217S0000000_28.get$arr$(15);
        this.LLJI = true;
        this.LLJIJIL = true;
        this.LLJILJIL = new LinkedHashMap();
        this.LLJILJILJ = new LinkedHashMap();
    }
}
