package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastPictureMemOpt;
import com.bytedance.android.livesdk.model.RoomSticker;
import com.bytedance.android.livesdk.model.Sticker;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS591S0100000_12;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0U6J, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0U6J extends AbstractC21673619ry<RecyclerView.ViewHolder> {
    public final boolean LL;
    public final Function2<? super RoomSticker, ? super Integer, Unit> LLILLJJLI;
    public int LLILZ;
    public int LLILZIL;
    public int LLILZLL;
    public String LLIZ;
    public Integer LLIZLLLIL;
    public final List<RoomSticker> LLILLL = new ArrayList();
    public final String LLJ = "item_selected";

    public final int LLLIIIIL() {
        int iIntValue = 0;
        Iterator it2 = ((LinkedHashMap) C2097608Jq.LJIIJ(new Pair("TEXT", Integer.valueOf(this.LLILZ)), new Pair("IMAGE", Integer.valueOf(this.LLILZIL)), new Pair("SPECIAL", Integer.valueOf(this.LLILZLL)))).entrySet().iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it2.next();
            if (((Number) entry.getValue()).intValue() > 0) {
                iIntValue = ((Number) entry.getValue()).intValue();
                break;
            }
        }
        return iIntValue + 1;
    }

    public final int LLLII() {
        return (this.LLILZ != 0 ? 1 : 0) + (this.LLILZIL != 0 ? 1 : 0) + (this.LLILZLL == 0 ? 0 : 1);
    }

    public final int LLLIILIL() {
        return this.LLILZ + this.LLILZIL + 2;
    }

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return ((ArrayList) this.LLILLL).size() + LLLII();
    }

    public final int LLLI(int i) {
        int i2 = 1;
        if (getItemViewType(i) != 1) {
            if (LLLII() >= 3 && i > LLLIILIL() - 2) {
                i2 = this.LLILZIL + this.LLILZ + 3;
            } else if (LLLII() >= 2 && i > LLLIIIIL() - 1) {
                i2 = this.LLILZ + 2;
            } else if (LLLII() < 1 || i <= 0) {
                i2 = 0;
            }
            return i - i2;
        }
        return -1;
    }

    @Override // X.AbstractC21673619ry
    public final int getItemViewType(int i) {
        int iLLLII = LLLII();
        if (iLLLII == 1 ? i == 0 : !(iLLLII == 2 ? !(i == 0 || i == LLLIIIIL()) : !(iLLLII == 3 && (i == 0 || i == LLLIIIIL() || i == LLLIILIL())))) {
            return 1;
        }
        if (this.LLILZ == 0 || i >= LLLIIIIL()) {
            return 3;
        }
        return 2;
    }

    @Override // X.AbstractC21673619ry
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        final RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            ((GridLayoutManager) layoutManager).LJIJI(new AbstractC214823195h() { // from class: X.0U6L
                @Override // X.AbstractC214823195h
                public final int LJFF(int i) {
                    if (this.LJ.getItemViewType(i) != 1) {
                        return 1;
                    }
                    return ((GridLayoutManager) layoutManager).LLILLJJLI;
                }
            });
        }
    }

    public final void setData(List<C0U74<RoomSticker>> list) {
        final ArrayList arrayList = new ArrayList();
        ArrayList<C0U74> arrayList2 = (ArrayList) list;
        int i = -1;
        for (C0U74 c0u74 : arrayList2) {
            String str = c0u74.LIZ;
            String str2 = C0UD4.LIZ;
            if (Intrinsics.LJFF(str, "livestickertext")) {
                this.LLILZ = c0u74.LIZIZ.size();
                arrayList.addAll(c0u74.LIZIZ);
                if (this.LL && this.LLIZ != null && this.LLIZLLLIL == null) {
                    i++;
                    LLLFZ(i, c0u74.LIZIZ);
                    if (this.LLIZLLLIL == null) {
                        i += this.LLILZ;
                    }
                }
            }
        }
        for (C0U74 c0u742 : arrayList2) {
            String str3 = c0u742.LIZ;
            String str4 = C0UD4.LIZ;
            if (Intrinsics.LJFF(str3, "livestickerimage")) {
                this.LLILZIL = c0u742.LIZIZ.size();
                arrayList.addAll(c0u742.LIZIZ);
                if (this.LL && this.LLIZ != null && this.LLIZLLLIL == null) {
                    i++;
                    LLLFZ(i, c0u742.LIZIZ);
                    if (this.LLIZLLLIL == null) {
                        i += this.LLILZIL;
                    }
                }
            }
        }
        for (C0U74 c0u743 : arrayList2) {
            String str5 = c0u743.LIZ;
            String str6 = C0UD4.LIZ;
            if (Intrinsics.LJFF(str5, "livestickerspecial")) {
                this.LLILZLL = c0u743.LIZIZ.size();
                arrayList.addAll(c0u743.LIZIZ);
            }
        }
        final List<RoomSticker> list2 = this.LLILLL;
        C21342318fd.LIZ(new AbstractC21342018fa(list2, arrayList) { // from class: X.00oW
            public final List<RoomSticker> LIZ;
            public final List<RoomSticker> LIZIZ;

            @Override // X.AbstractC21342018fa
            public final int LIZLLL() {
                return this.LIZIZ.size();
            }

            @Override // X.AbstractC21342018fa
            public final int LJ() {
                return this.LIZ.size();
            }

            {
                this.LIZ = list2;
                this.LIZIZ = arrayList;
            }

            @Override // X.AbstractC21342018fa
            public final boolean LIZ(int i2, int i3) {
                if (Intrinsics.LJFF(((RoomSticker) ListProtector.get(this.LIZ, i2)).image, ((RoomSticker) ListProtector.get(this.LIZIZ, i3)).image) && Intrinsics.LJFF(((RoomSticker) ListProtector.get(this.LIZ, i2)).ninePatchImage, ((RoomSticker) ListProtector.get(this.LIZIZ, i3)).ninePatchImage)) {
                    return true;
                }
                return false;
            }

            @Override // X.AbstractC21342018fa
            public final boolean LIZIZ(int i2, int i3) {
                if (((Sticker) ListProtector.get(this.LIZ, i2)).id == ((Sticker) ListProtector.get(this.LIZIZ, i3)).id && ((Sticker) ListProtector.get(this.LIZ, i2)).type == ((Sticker) ListProtector.get(this.LIZIZ, i3)).type) {
                    return true;
                }
                return false;
            }
        }, true).LIZJ(this);
        ((ArrayList) this.LLILLL).clear();
        ((ArrayList) this.LLILLL).addAll(arrayList);
    }

    public C0U6J(Function2 function2, boolean z) {
        this.LL = z;
        this.LLILLJJLI = function2;
    }

    public final void LLLFZ(int i, List<RoomSticker> list) {
        Iterator<RoomSticker> it2 = list.iterator();
        while (it2.hasNext()) {
            i++;
            if (Intrinsics.LJFF(it2.next().LIZ, this.LLIZ)) {
                this.LLIZLLLIL = Integer.valueOf(i);
                return;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x0164  */
    @Override // X.AbstractC21673619ry
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.ViewHolder r11, int r12) {
        /*
            Method dump skipped, instruction units count: 389
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0U6J.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        int i2;
        RecyclerView.ViewHolder c0u6k;
        if (i == 1) {
            c0u6k = new C0U6M(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.hmz, viewGroup, false));
        } else {
            LayoutInflater layoutInflaterNe = C786410Ut5.ne(viewGroup.getContext());
            if (this.LL) {
                i2 = R.layout.hn4;
            } else {
                i2 = R.layout.hn3;
            }
            View viewTd = C786410Ut5.Td(layoutInflaterNe, i2, viewGroup, false);
            if (LiveBroadcastPictureMemOpt.fitStickerPanelImageSize()) {
                c0u6k = new C0U6K(this.LL, viewTd, Integer.valueOf(i), new AwS591S0100000_12(this, 1080));
            } else {
                viewTd.setTag(Integer.valueOf(i));
                c0u6k = new C0U6K(this.LL, viewTd, null, new AwS591S0100000_12(this, 1081));
            }
        }
        try {
            View view = c0u6k.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c0u6k.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c0u6k.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(c0u6k.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c0u6k.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c0u6k.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = c0u6k.getClass().getName();
        return c0u6k;
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i, List<? extends Object> list) {
        if ((viewHolder instanceof C0U6K) && (!list.isEmpty())) {
            Iterator<? extends Object> it2 = list.iterator();
            while (it2.hasNext()) {
                if (Intrinsics.LJFF(it2.next(), this.LLJ)) {
                    boolean z = false;
                    int i2 = 3;
                    if (LLLII() < 3 || i <= LLLIILIL() - 2) {
                        if (LLLII() >= 2 && i > LLLIIIIL() - 1) {
                            i2 = 2;
                        } else if (LLLII() >= 1 && i > 0) {
                            i2 = 1;
                        } else {
                            i2 = 0;
                        }
                    }
                    Sticker sticker = (Sticker) ListProtector.get(this.LLILLL, i - i2);
                    C0U6K c0u6k = (C0U6K) viewHolder;
                    if (this.LL && Intrinsics.LJFF(sticker.LIZ, this.LLIZ)) {
                        z = true;
                    }
                    c0u6k.I5(z);
                } else {
                    super.onBindViewHolder(viewHolder, i, list);
                }
            }
            return;
        }
        super.onBindViewHolder(viewHolder, i, list);
    }
}
