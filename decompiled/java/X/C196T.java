package X;

import Y.AAListenerS330S0100000_19;
import Y.AUListenerS14S0102000_2;
import Y.AUListenerS234S0200000_32;
import Y.AUListenerS256S0100000_6;
import Y.AUListenerS268S0100000_19;
import Y.AUListenerS64S0101000_2;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.creative.model.album.LivePhotoPreviewMode;
import com.ss.android.ugc.aweme.creative.model.edit.aicover.AICoverInfo;
import com.ss.android.ugc.aweme.creative.model.edit.aicover.AICoverItem;
import com.ss.android.ugc.aweme.image.aicover.AICoverPluginService;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS118S0110000_32;
import kotlin.jvm.internal.AwS148S0110000_32;
import kotlin.jvm.internal.AwS39S0102000_4;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.AwS576S0100000_32;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: renamed from: X.196T, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C196T extends AbstractC21673619ry<RecyclerView.ViewHolder> {
    public final Function0<Boolean> LL;
    public final Function0<Boolean> LLILLJJLI;
    public AICoverInfo LLILZIL;
    public InterfaceC214845196d LLILZLL;
    public InterfaceC214842196a LLIZ;
    public C196Q LLIZLLLIL;
    public View.OnClickListener LLJ;
    public C196O LLJI;
    public C196R LLJIJIL;
    public Integer LLJILJIL;
    public Integer LLJILJILJ;
    public boolean LLJILLL;
    public boolean LLJJ;
    public C0DK9 LLJJI;
    public Integer LLJJIII;
    public Integer LLJJIJI;
    public Integer LLJJIJIIJIL;
    public Float LLJJIJIL;
    public boolean LLJJJ;
    public boolean LLJJJIL;
    public boolean LLJJJJJIL;
    public List<C196X> LLILLL = new ArrayList(0);
    public List<C196X> LLILZ = C13BV.INSTANCE;
    public float LLJJJJ = 1.0f;

    public final int LLLL() {
        Iterator<C196X> it2 = this.LLILLL.iterator();
        int i = 0;
        while (it2.hasNext()) {
            if (it2.next().LJ == C12GM.AI_COVER_GENERATING.getType()) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public final int LLLLII() {
        List<AICoverItem> covers;
        AICoverInfo aICoverInfo = this.LLILZIL;
        if (aICoverInfo == null || (covers = aICoverInfo.getCovers()) == null) {
            covers = C13BV.INSTANCE;
        }
        if (covers.isEmpty()) {
            return 0;
        }
        Iterator<AICoverItem> it2 = covers.iterator();
        int progress = 0;
        while (it2.hasNext()) {
            progress += (int) (it2.next().getProgress() * 100);
        }
        return C13LZ.LJ(progress / covers.size(), 0, 100);
    }

    public final int LLLLIIL() {
        List<C196X> list = this.LLILLL;
        int i = 0;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<C196X> it2 = list.iterator();
            i = 0;
            while (it2.hasNext()) {
                if (it2.next().LJ == C12GM.THUMBNAIL.getType() && (i = i + 1) < 0) {
                    C1697810uHb.LJIJ();
                    throw null;
                }
            }
        }
        return i;
    }

    public final boolean LLLLIILL() {
        AICoverInfo aICoverInfo = this.LLILZIL;
        if (aICoverInfo == null || !aICoverInfo.isConfirmed()) {
            return false;
        }
        if (aICoverInfo.getCovers().isEmpty()) {
            return true;
        }
        List<AICoverItem> covers = aICoverInfo.getCovers();
        if (!(covers instanceof Collection) || !covers.isEmpty()) {
            Iterator<AICoverItem> it2 = covers.iterator();
            while (it2.hasNext()) {
                if (it2.next().getState() == EnumC1454140nwa.GENERATING) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LLLLILI() {
        /*
            r5 = this;
            com.ss.android.ugc.aweme.creative.model.edit.aicover.AICoverInfo r4 = r5.LLILZIL
            r3 = 0
            if (r4 != 0) goto L6
            return r3
        L6:
            boolean r0 = r4.isConfirmed()
            if (r0 != 0) goto Ld
            return r3
        Ld:
            java.util.List r0 = r4.getCovers()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L2b
            java.util.List r1 = r4.getCovers()
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L2d
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L2d
        L25:
            boolean r0 = LLLLIL(r4)
            if (r0 == 0) goto L2c
        L2b:
            r3 = 1
        L2c:
            return r3
        L2d:
            java.util.Iterator r2 = r1.iterator()
        L31:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L25
            java.lang.Object r0 = r2.next()
            com.ss.android.ugc.aweme.creative.model.edit.aicover.AICoverItem r0 = (com.ss.android.ugc.aweme.creative.model.edit.aicover.AICoverItem) r0
            X.0nwa r1 = r0.getState()
            X.0nwa r0 = X.EnumC1454140nwa.GENERATING
            if (r1 != r0) goto L31
            goto L2b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C196T.LLLLILI():boolean");
    }

    public final void LLLLLIL() {
        List<C196X> list = this.LLILLL;
        ArrayList arrayList = new ArrayList();
        for (C196X c196x : list) {
            if (c196x.LJ == C12GM.THUMBNAIL.getType()) {
                arrayList.add(c196x);
            }
        }
        this.LLILZ = arrayList;
    }

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LLILLL.size();
    }

    public final void LLLLIILLL() {
        int iLLLL;
        int i;
        if (LLLLILI() && (iLLLL = LLLL()) >= 0) {
            List listLL = C13LP.LL(this.LLILLL, iLLLL);
            if ((listLL instanceof Collection) && listLL.isEmpty()) {
                i = 0;
            } else {
                Iterator it2 = listLL.iterator();
                i = 0;
                while (it2.hasNext()) {
                    if (((C196X) it2.next()).LJ == C12GM.THUMBNAIL.getType() && (i = i + 1) < 0) {
                        C1697810uHb.LJIJ();
                        throw null;
                    }
                }
            }
            AICoverInfo aICoverInfo = this.LLILZIL;
            if (aICoverInfo == null || i != aICoverInfo.getInsertIndex()) {
                AICoverInfo aICoverInfo2 = this.LLILZIL;
                this.LLILZIL = aICoverInfo2 != null ? aICoverInfo2.copy(aICoverInfo2.taskId, i, aICoverInfo2.covers, aICoverInfo2.selectedCoverId, aICoverInfo2.isConfirmed, aICoverInfo2.skipReorderOnTerminal) : null;
                C196Q c196q = this.LLIZLLLIL;
                if (c196q != null) {
                    c196q.LIZIZ(i);
                }
            }
        }
    }

    public static boolean LLLLIL(AICoverInfo aICoverInfo) {
        AICoverItem next;
        if (aICoverInfo == null) {
            return false;
        }
        if (!aICoverInfo.getSkipReorderOnTerminal()) {
            return aICoverInfo.isAllFailed();
        }
        String selectedCoverId = aICoverInfo.getSelectedCoverId();
        if (selectedCoverId == null) {
            return false;
        }
        Iterator<AICoverItem> it2 = aICoverInfo.getCovers().iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(next.getSubTaskId(), selectedCoverId)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        AICoverItem aICoverItem = next;
        if (aICoverItem == null || !aICoverItem.isFinished() || aICoverItem.isReady()) {
            return false;
        }
        return true;
    }

    public final void LLLILZ(RecyclerView.ViewHolder viewHolder) {
        int iIntValue;
        boolean z;
        Integer numValueOf;
        View view;
        Integer num;
        C201955140j.LIZJ(C830690WiJ.LIZIZ, "Begin Image Swap");
        if (!this.LLJJ) {
            Integer numValueOf2 = Integer.valueOf(viewHolder.getBindingAdapterPosition());
            this.LLJILJIL = numValueOf2;
            List<C196X> list = this.LLILLL;
            if (numValueOf2 != null) {
                iIntValue = numValueOf2.intValue();
            } else {
                iIntValue = -1;
            }
            C196X c196x = (C196X) C13LP.LJJJLZIJ(iIntValue, list);
            if (c196x != null && c196x.LJ == C12GM.AI_COVER_GENERATING.getType()) {
                z = true;
            } else {
                z = false;
            }
            this.LLJILLL = z;
            if (!z && (num = this.LLJILJIL) != null) {
                numValueOf = Integer.valueOf(LLLLL(num.intValue()));
            } else {
                numValueOf = null;
            }
            this.LLJILJILJ = numValueOf;
            Integer num2 = this.LLJILJIL;
            if (num2 != null) {
                int iIntValue2 = num2.intValue();
                InterfaceC214842196a interfaceC214842196a = this.LLIZ;
                if (interfaceC214842196a != null) {
                    LLLLL(iIntValue2);
                    interfaceC214842196a.LIZJ();
                }
            }
            C0DK9 c0dk9 = this.LLJJI;
            if (c0dk9 != null && (view = c0dk9.itemView) != null) {
                C337180DJs.LIZ(view);
            }
        }
        this.LLJJ = true;
    }

    public final boolean LLLJL(int i) {
        Integer numValueOf;
        int size;
        C196X c196x = (C196X) C13LP.LJJJLZIJ(i, this.LLILLL);
        if (c196x != null) {
            numValueOf = Integer.valueOf(c196x.LJ);
        } else {
            numValueOf = null;
        }
        int type = C12GM.THUMBNAIL.getType();
        if (numValueOf == null || numValueOf.intValue() != type) {
            int type2 = C12GM.AI_COVER_GENERATING.getType();
            if (numValueOf == null || numValueOf.intValue() != type2) {
                return false;
            }
        }
        if (this.LL.invoke().booleanValue() && this.LLILLJJLI.invoke().booleanValue()) {
            size = this.LLILLL.size();
        } else {
            size = this.LLILLL.size() - 1;
        }
        if (i < 0 || i >= size) {
            return false;
        }
        return true;
    }

    public final C196X LLLLIIIILLL(int i) {
        if (i >= 0 && i < this.LLILLL.size()) {
            return (C196X) ListProtector.get(this.LLILLL, i);
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ba, code lost:
    
        r1 = 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0079 A[PHI: r1
      0x0079: PHI (r1v3 java.lang.Integer) = (r1v2 java.lang.Integer), (r1v5 java.lang.Integer) binds: [B:38:0x00be, B:26:0x0077] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLLLJI(androidx.recyclerview.widget.RecyclerView.ViewHolder r11) {
        /*
            Method dump skipped, instruction units count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C196T.LLLLJI(androidx.recyclerview.widget.RecyclerView$ViewHolder):void");
    }

    public final int LLLLL(int i) {
        List<C196X> list = this.LLILLL;
        int i2 = 0;
        List listLL = C13LP.LL(list, C13LZ.LJ(i, 0, list.size()));
        if (!(listLL instanceof Collection) || !listLL.isEmpty()) {
            Iterator it2 = listLL.iterator();
            i2 = 0;
            while (it2.hasNext()) {
                if (((C196X) it2.next()).LJ == C12GM.THUMBNAIL.getType() && (i2 = i2 + 1) < 0) {
                    C1697810uHb.LJIJ();
                    throw null;
                }
            }
        }
        return i2;
    }

    @Override // X.AbstractC21673619ry
    public final int getItemViewType(int i) {
        int i2 = ((C196X) ListProtector.get(this.LLILLL, i)).LJ;
        C12GM c12gm = C12GM.ADD;
        if (i2 == c12gm.getType()) {
            return c12gm.getType();
        }
        C12GM c12gm2 = C12GM.AI_COVER_GENERATING;
        if (i2 == c12gm2.getType()) {
            return c12gm2.getType();
        }
        return super.getItemViewType(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC21673619ry
    public final void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
        if (viewHolder instanceof C196Y) {
            ((C196Y) viewHolder).e4();
        }
        super.onViewRecycled(viewHolder);
    }

    public C196T(AwS576S0100000_32 awS576S0100000_32, AwS576S0100000_32 awS576S0100000_322) {
        this.LL = awS576S0100000_32;
        this.LLILLJJLI = awS576S0100000_322;
    }

    public final void LLLFZ(List<C196X> list, C12GM c12gm) {
        ((ArrayList) list).add(new C196X((String) null, 0, 0, (UrlModel) null, c12gm.getType(), this.LLJJJJ, false, (LivePhotoPreviewMode) null, false, 943));
    }

    public final void LLLILZLLLI(C196Y c196y, int i) {
        float f;
        int i2;
        boolean z;
        float fLIZ;
        int i3;
        float f2;
        int i4;
        C196X c196xLLLLIIIILLL = LLLLIIIILLL(i);
        if (c196xLLLLIIIILLL != null) {
            f = c196xLLLLIIIILLL.LJI;
        } else {
            f = this.LLJJJJ;
        }
        double d = C196S.LLJJJJLIIL;
        int iLIZIZ = (int) (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(d))) * f);
        if (C196H.LIZJ(f)) {
            i2 = 4;
        } else {
            i2 = 8;
        }
        int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(i2));
        boolean zLLLLIL = LLLLIL(this.LLILZIL);
        Integer num = this.LLJJIII;
        Integer num2 = this.LLJJIJI;
        if (c196xLLLLIIIILLL != null && c196xLLLLIIIILLL.LJFF && num != null && num2 != null && num.intValue() <= i && i <= num2.intValue()) {
            z = true;
        } else {
            z = false;
        }
        boolean z2 = !C196H.LIZJ(f);
        float fLIZ2 = 1.0f;
        if (zLLLLIL) {
            boolean z3 = !C196H.LIZJ(f);
            if (z) {
                c196y.f3(!z3, z3);
                c196y.LJLJJI();
                if (!C196H.LIZJ(f)) {
                    fLIZ2 = C196H.LIZ();
                }
                if (C196H.LIZJ(f)) {
                    i4 = 8;
                } else {
                    i4 = 4;
                }
                LLLI(c196y, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(d))), fLIZ2, f, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(i4)), iLIZIZ2, 0.0f, 0.0f, new AwS118S0110000_32(c196y, z3, 8), new AwS148S0110000_32(c196y, z3, 2));
            } else {
                c196y.T4(iLIZIZ, iLIZIZ2);
                c196y.f3(z3, !z3);
            }
            LLLJ(c196y.A3(), i);
            c196y.getItemView().setClickable(true);
            c196y.getItemView().setFocusable(true);
            C786410Ut5.I7(new C19LQ(this, 0), c196y.getItemView());
            return;
        }
        if (z) {
            c196y.LLLF(z2);
            if (C196H.LIZJ(f)) {
                fLIZ = 1.0f;
            } else {
                fLIZ = C196H.LIZ();
            }
            if (C196H.LIZJ(f)) {
                i3 = 8;
            } else {
                i3 = 4;
            }
            int iLIZIZ3 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(i3));
            if (z2) {
                f2 = 0.0f;
            } else {
                f2 = 1.0f;
                fLIZ2 = 0.0f;
            }
            C786410Ut5.LLLLZLL(c196y.S3(), 0);
            C786410Ut5.LLIIJLIL(c196y.LLJJLIIIJLLLLLLLZ(), 0);
            LLLI(c196y, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(d))), fLIZ, f, iLIZIZ3, iLIZIZ2, f2, fLIZ2, null, new AwS148S0110000_32(c196y, z2, 3));
        } else {
            c196y.T4(iLIZIZ, iLIZIZ2);
            c196y.LLLF(z2);
        }
        LLLJ(c196y.A3(), i);
        c196y.S3().setText(C20642515q3.LJI(2131821399));
        c196y.LLJJLIIIJLLLLLLLZ().setProgress(LLLLII());
        c196y.n0();
        c196y.getItemView().setClickable(false);
        c196y.getItemView().setFocusable(false);
        C786410Ut5.I7(null, c196y.getItemView());
    }

    public final void LLLJ(TuxTextView tuxTextView, int i) {
        int iLIZIZ;
        ViewTreeObserver viewTreeObserver;
        String strValueOf;
        Float fValueOf;
        C196X c196xLLLLIIIILLL = LLLLIIIILLL(i);
        if (c196xLLLLIIIILLL == null) {
            return;
        }
        tuxTextView.setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(3)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(3)));
        int i2 = C196S.LLJJJJ;
        if (C196H.LIZJ(this.LLJJJJ)) {
            tuxTextView.setBackgroundResource(R.drawable.a8c);
        } else {
            tuxTextView.setBackgroundResource(R.drawable.a8b);
        }
        tuxTextView.setMinTextSize(11.0f);
        int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(C196S.LLJJJJLIIL)));
        if (c196xLLLLIIIILLL.LJIIIZ) {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(26));
        } else {
            iLIZIZ = 0;
        }
        tuxTextView.setMaxWidth(iLIZIZ2 - iLIZIZ);
        Integer num = this.LLJJIJIIJIL;
        if ((num == null || num.intValue() == 0) && (viewTreeObserver = tuxTextView.getViewTreeObserver()) != null) {
            ViewTreeObserverOnGlobalLayoutListenerC21523919Lh viewTreeObserverOnGlobalLayoutListenerC21523919Lh = new ViewTreeObserverOnGlobalLayoutListenerC21523919Lh(tuxTextView, this, 1);
            viewTreeObserver.addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC21523919Lh);
            C2187701Ajg.LIZ(viewTreeObserver, viewTreeObserverOnGlobalLayoutListenerC21523919Lh, ViewTreeObserver.OnGlobalLayoutListener.class);
        }
        if (this.LLJJIJIL == null) {
            float textSize = tuxTextView.getTextSize();
            if (textSize == 0.0f) {
                fValueOf = Float.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(13)));
            } else {
                fValueOf = Float.valueOf(textSize);
            }
            this.LLJJIJIL = fValueOf;
        }
        int iLIZIZ3 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(15));
        int iLIZIZ4 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
        if (c196xLLLLIIIILLL.LJFF) {
            if (C196H.LIZJ(c196xLLLLIIIILLL.LJI)) {
                tuxTextView.setPadding(0, 0, 0, 0);
                tuxTextView.setGravity(17);
                tuxTextView.setText(String.valueOf(i + 1));
                C786410Ut5.LLLLZLL(tuxTextView, 0);
                tuxTextView.setTuxFont(92);
                LLLIL(tuxTextView, iLIZIZ4, iLIZIZ3, new AwS39S0102000_4(iLIZIZ3, i, tuxTextView, 0));
                return;
            }
            tuxTextView.setPadding(0, 0, 0, 0);
            tuxTextView.setGravity(17);
            C786410Ut5.LLLLZLL(tuxTextView, 0);
            tuxTextView.setText(String.valueOf(i + 1));
            LLLIL(tuxTextView, iLIZIZ3, iLIZIZ4, new AwS39S0102000_4(iLIZIZ4, i, tuxTextView, 1));
            return;
        }
        if (C196H.LIZJ(c196xLLLLIIIILLL.LJI)) {
            tuxTextView.getLayoutParams().width = -2;
            tuxTextView.getLayoutParams().height = -2;
            tuxTextView.setMinWidth(iLIZIZ3);
            tuxTextView.setMinHeight(iLIZIZ3);
            tuxTextView.setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1)));
            tuxTextView.setText(String.valueOf(i + 1));
            tuxTextView.setTuxFont(92);
            C786410Ut5.LLLLZLL(tuxTextView, 0);
            return;
        }
        tuxTextView.getLayoutParams().width = -2;
        tuxTextView.getLayoutParams().height = -2;
        tuxTextView.setMinWidth(iLIZIZ4);
        tuxTextView.setMinHeight(iLIZIZ4);
        tuxTextView.setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(5.5d))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(1.5d))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(5.5d))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(1.5d))));
        if (i == 0) {
            strValueOf = C20642515q3.LJI(2131839850);
        } else {
            strValueOf = String.valueOf(i + 1);
        }
        tuxTextView.setText(strValueOf);
        tuxTextView.setTuxFont(62);
        C786410Ut5.LLLLZLL(tuxTextView, 0);
    }

    public final List<C196X> LLLJIL(List<C196X> list, boolean z) {
        int iLJ;
        AICoverInfo aICoverInfo = this.LLILZIL;
        int i = 0;
        if (aICoverInfo != null) {
            iLJ = C13LZ.LJ(aICoverInfo.getInsertIndex(), 0, this.LLILZ.size());
        } else {
            iLJ = 0;
        }
        ArrayList arrayList = new ArrayList();
        for (C196X c196x : list) {
            int i2 = i + 1;
            if (i >= 0) {
                if (LLLLILI() && i == iLJ) {
                    LLLFZ(arrayList, C12GM.AI_COVER_GENERATING);
                }
                arrayList.add(c196x);
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        if (LLLLILI() && iLJ == list.size()) {
            LLLFZ(arrayList, C12GM.AI_COVER_GENERATING);
        }
        if (z) {
            LLLFZ(arrayList, C12GM.ADD);
        }
        return arrayList;
    }

    public final void LLLLJ(RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
        Integer numValueOf;
        InterfaceC214842196a interfaceC214842196a;
        int bindingAdapterPosition = viewHolder.getBindingAdapterPosition();
        int bindingAdapterPosition2 = viewHolder2.getBindingAdapterPosition();
        C830690WiJ c830690WiJ = C830690WiJ.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Image Swap: ");
        sbLIZ.append(bindingAdapterPosition);
        sbLIZ.append(" -> ");
        sbLIZ.append(bindingAdapterPosition2);
        C201955140j.LIZJ(c830690WiJ, C2188811AlT.LIZIZ(sbLIZ));
        if (LLLJL(bindingAdapterPosition) && LLLJL(bindingAdapterPosition2)) {
            C196X c196x = (C196X) C13LP.LJJJLZIJ(bindingAdapterPosition, this.LLILLL);
            boolean z = true;
            if (c196x != null && c196x.LJ == C12GM.THUMBNAIL.getType()) {
                numValueOf = Integer.valueOf(LLLLL(bindingAdapterPosition));
            } else {
                numValueOf = null;
            }
            C196X c196x2 = (C196X) ListProtector.remove(this.LLILLL, bindingAdapterPosition);
            if (c196x2.LJ != C12GM.AI_COVER_GENERATING.getType()) {
                z = false;
            }
            ListProtector.add(this.LLILLL, bindingAdapterPosition2, c196x2);
            LLLLLIL();
            if (!z) {
                LLLLIILLL();
            }
            notifyItemMoved(bindingAdapterPosition, bindingAdapterPosition2);
            if (numValueOf != null && (interfaceC214842196a = this.LLIZ) != null) {
                interfaceC214842196a.LJI(numValueOf.intValue(), LLLLL(bindingAdapterPosition2));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(final RecyclerView.ViewHolder viewHolder, final int i) {
        int iLIZIZ;
        FrameLayout.LayoutParams layoutParams;
        InterfaceC214845196d interfaceC214845196d;
        int i2 = 20;
        int i3 = 4;
        int i4 = 8;
        if (viewHolder instanceof C0DK9) {
            C0DK9 c0dk9 = (C0DK9) viewHolder;
            this.LLJJI = c0dk9;
            if (this.LLJJ) {
                C786410Ut5.LJLLLLLL(8, viewHolder.itemView);
            }
            int i5 = C196S.LLJJJJ;
            if (!C196H.LIZJ(this.LLJJJJ)) {
                i3 = 8;
            }
            TuxIconView tuxIconView = c0dk9.LL;
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.a03);
            c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(Integer.valueOf(i3)));
            tuxIconView.setBackground(c384050F3z.LIZ(c0dk9.itemView.getContext()));
            C196X c196xLLLLIIIILLL = LLLLIIIILLL(i);
            if (c196xLLLLIIIILLL != null) {
                if (c196xLLLLIIIILLL.LJFF) {
                    Integer num = this.LLJJIII;
                    if (num != null) {
                        int iIntValue = num.intValue();
                        Integer num2 = this.LLJJIJI;
                        if (num2 != null) {
                            int iIntValue2 = num2.intValue();
                            if (iIntValue <= i && i <= iIntValue2) {
                                if (C196H.LIZJ(c196xLLLLIIIILLL.LJI)) {
                                    LLLIIIIL(this, c0dk9.LL, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(C196S.LLJJJJLIIL))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(C196S.LLJJL))), 1.0f, c196xLLLLIIIILLL.LJI, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)));
                                } else {
                                    LLLIIIIL(this, c0dk9.LL, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(C196S.LLJJJJLIIL))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(C196S.LLJJL))), C196H.LIZ(), c196xLLLLIIIILLL.LJI, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20)));
                                }
                            } else {
                                ViewGroup.LayoutParams layoutParams2 = c0dk9.LL.getLayoutParams();
                                layoutParams2.height = (int) (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(C196S.LLJJL))) * c196xLLLLIIIILLL.LJI);
                                float fLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(C196S.LLJJJJLIIL)));
                                float f = c196xLLLLIIIILLL.LJI;
                                layoutParams2.width = (int) (fLIZIZ * f);
                                if (C196H.LIZJ(f)) {
                                    i2 = 12;
                                }
                                c0dk9.LL.setIconWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i2))));
                                c0dk9.LL.setIconHeight(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i2))));
                                c196xLLLLIIIILLL.LJFF = false;
                            }
                        }
                    }
                } else {
                    ViewGroup.LayoutParams layoutParams3 = c0dk9.LL.getLayoutParams();
                    layoutParams3.height = (int) (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(C196S.LLJJL))) * c196xLLLLIIIILLL.LJI);
                    float fLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(C196S.LLJJJJLIIL)));
                    float f2 = c196xLLLLIIIILLL.LJI;
                    layoutParams3.width = (int) (fLIZIZ2 * f2);
                    if (C196H.LIZJ(f2)) {
                        i2 = 12;
                    }
                    c0dk9.LL.setIconWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i2))));
                    c0dk9.LL.setIconHeight(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i2))));
                }
            }
            C786410Ut5.I7(new C19LQ(this, 1), c0dk9.LL);
            ((C196X) ListProtector.get(this.LLILLL, i)).LJFF = false;
            return;
        }
        C196X c196x = (C196X) C13LP.LJJJLZIJ(i, this.LLILLL);
        if (c196x != null && c196x.LJ == C12GM.AI_COVER_GENERATING.getType()) {
            if (!(viewHolder instanceof C196Y)) {
                C786410Ut5.LJLLLLLL(8, viewHolder.itemView);
                return;
            } else {
                LLLILZLLLI((C196Y) viewHolder, i);
                ((C196X) ListProtector.get(this.LLILLL, i)).LJFF = false;
                return;
            }
        }
        final C1322110kVd c1322110kVd = (C1322110kVd) viewHolder.itemView.findViewById(R.id.kfm);
        int i6 = C196S.LLJJJJ;
        if (!C196H.LIZJ(this.LLJJJJ)) {
            i3 = 8;
        }
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a03, c1322110kVd.getContext());
        if (numLIZJ != null) {
            int iIntValue3 = numLIZJ.intValue();
            C1331100kk8 c1331100kk8LIZLLL = C1331100kk8.LIZLLL(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i3))));
            c1331100kk8LIZLLL.LJ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1)), iIntValue3);
            ((C1331070kk5) c1322110kVd.getHierarchy()).LJJIII(c1331100kk8LIZLLL);
        }
        C196X c196xLLLLIIIILLL2 = LLLLIIIILLL(i);
        if (c196xLLLLIIIILLL2 != null) {
            if (c196xLLLLIIIILLL2.LJFF) {
                Integer num3 = this.LLJJIII;
                if (num3 != null && this.LLJJIJI != null) {
                    int iIntValue4 = num3.intValue();
                    Integer num4 = this.LLJJIJI;
                    if (num4 != null) {
                        int iIntValue5 = num4.intValue();
                        if (iIntValue4 <= i && i <= iIntValue5) {
                            if (C196H.LIZJ(c196xLLLLIIIILLL2.LJI)) {
                                int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(C196S.LLJJJJLIIL)));
                                C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(C196S.LLJJL)));
                                LLLII(c1322110kVd, iLIZIZ2, 1.0f, c196xLLLLIIIILLL2.LJI);
                            } else {
                                int iLIZIZ3 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(C196S.LLJJJJLIIL)));
                                C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(C196S.LLJJL)));
                                LLLII(c1322110kVd, iLIZIZ3, C196H.LIZ(), c196xLLLLIIIILLL2.LJI);
                            }
                        } else {
                            ViewGroup.LayoutParams layoutParams4 = c1322110kVd.getLayoutParams();
                            layoutParams4.width = (int) (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(C196S.LLJJJJLIIL))) * c196xLLLLIIIILLL2.LJI);
                            layoutParams4.height = (int) (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(C196S.LLJJL))) * c196xLLLLIIIILLL2.LJI);
                            c196xLLLLIIIILLL2.LJFF = false;
                        }
                    }
                } else {
                    ViewGroup.LayoutParams layoutParams5 = c1322110kVd.getLayoutParams();
                    layoutParams5.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(C196S.LLJJJJLIIL)));
                    layoutParams5.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(C196S.LLJJL)));
                }
            } else {
                ViewGroup.LayoutParams layoutParams6 = c1322110kVd.getLayoutParams();
                layoutParams6.width = (int) (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(C196S.LLJJJJLIIL))) * c196xLLLLIIIILLL2.LJI);
                layoutParams6.height = (int) (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(C196S.LLJJL))) * c196xLLLLIIIILLL2.LJI);
            }
        }
        C1447470nlp.LIZIZ(c1322110kVd, C11VU.LIZ(i3));
        String string = ((C196X) ListProtector.get(this.LLILLL, i)).LIZ;
        if (!Intrinsics.LJFF(string, c1322110kVd.getTag())) {
            c1322110kVd.setTag(string);
            Context context = viewHolder.itemView.getContext();
            int iLIZIZ4 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(C196S.LLJJJJLIIL)));
            int iLIZIZ5 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(C196S.LLJJL)));
            if (TextUtils.isEmpty(string)) {
                UrlModel urlModel = ((C196X) ListProtector.get(this.LLILLL, i)).LIZLLL;
                if (urlModel != null) {
                    c1322110kVd.setTag(urlModel.getUri());
                    c1322110kVd.setBackgroundColor(C960203pA.LIZ(R.attr.bv, context));
                    C1324750kZt.LJI(c1322110kVd, urlModel, iLIZIZ4, iLIZIZ5);
                } else {
                    c1322110kVd.setBackgroundColor(C960203pA.LIZ(R.attr.bv, context));
                }
            } else if (u.LJIIZILJ(string, ".raw", false)) {
                C574070MfN.LJI(string, ((C196X) ListProtector.get(this.LLILLL, i)).LIZIZ, ((C196X) ListProtector.get(this.LLILLL, i)).LIZJ, null, new C530240Kqs(c1322110kVd, iLIZIZ4, iLIZIZ5), 8);
            } else {
                if (!C2471909mP.LJJIIZI(string)) {
                    string = Uri.fromFile(new C0VSJ(string)).toString();
                }
                C1324750kZt.LJIIIZ(c1322110kVd, string, iLIZIZ4, iLIZIZ5);
            }
        }
        C786410Ut5.q9(c1322110kVd, new C19IN() { // from class: X.196W
            @Override // X.C19IN
            public final void LIZ(View view) {
                if (this.LLILZLL.LL.invoke().booleanValue() && !this.LLILZLL.LLILLJJLI.invoke().booleanValue()) {
                    return;
                }
                int i7 = C196S.LLJJJJ;
                if (C196H.LIZJ(this.LLILZLL.LLJJJJ)) {
                    this.LLILZLL.LLJJJ = true;
                }
                C196T c196t = this.LLILZLL;
                InterfaceC214845196d interfaceC214845196d2 = c196t.LLILZLL;
                if (interfaceC214845196d2 != null) {
                    interfaceC214845196d2.LJ(c1322110kVd, c196t.LLLLL(viewHolder.getLayoutPosition()));
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(600, 2);
            }
        });
        c1322110kVd.setOnLongClickListener(new View.OnLongClickListener() { // from class: X.196f
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return true;
            }
        });
        LLLJ((TuxTextView) viewHolder.itemView.findViewById(R.id.kfp), i);
        TuxIconView tuxIconView2 = (TuxIconView) viewHolder.itemView.findViewById(R.id.n3g);
        if (tuxIconView2 != null) {
            int iLIZIZ6 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14));
            tuxIconView2.setIconHeight(iLIZIZ6);
            tuxIconView2.setIconWidth(iLIZIZ6);
            ViewGroup.LayoutParams layoutParams7 = tuxIconView2.getLayoutParams();
            layoutParams7.height = iLIZIZ6;
            layoutParams7.width = iLIZIZ6;
        }
        C196X c196xLLLLIIIILLL3 = LLLLIIIILLL(i);
        Integer numLIZJ2 = null;
        if (c196xLLLLIIIILLL3 != null) {
            if (C196H.LIZJ(c196xLLLLIIIILLL3.LJI)) {
                if (tuxIconView2 != null) {
                    C337180DJs.LIZ(tuxIconView2);
                }
            } else if (C295670BiP.LIZ() && c196xLLLLIIIILLL3.LJII) {
                int i7 = C1413280msg.LIZ[c196xLLLLIIIILLL3.LJIIIIZZ.ordinal()];
                if (i7 != 1) {
                    if (i7 != 2) {
                        if (i7 == 3) {
                            if (tuxIconView2 != null) {
                                C337180DJs.LIZ(tuxIconView2);
                            }
                        } else {
                            throw new C1954807lC();
                        }
                    } else if (C295810Bid.LIZ()) {
                        if (tuxIconView2 != null) {
                            C337180DJs.LIZJ(tuxIconView2);
                        }
                        C419910GdJ c419910GdJ = new C419910GdJ();
                        c419910GdJ.LIZ = R.raw.icon_live_photo_unlimited;
                        Context context2 = viewHolder.itemView.getContext();
                        if (context2 != null) {
                            numLIZJ2 = C1308910kAL.LIZJ(R.attr.ee, context2);
                        }
                        c419910GdJ.LIZLLL = numLIZJ2;
                        tuxIconView2.setTuxIcon(c419910GdJ);
                    } else if (tuxIconView2 != null) {
                        C337180DJs.LIZ(tuxIconView2);
                    }
                } else {
                    if (tuxIconView2 != null) {
                        C337180DJs.LIZJ(tuxIconView2);
                    }
                    C419910GdJ c419910GdJ2 = new C419910GdJ();
                    c419910GdJ2.LIZ = R.raw.icon_live_photo;
                    Context context3 = viewHolder.itemView.getContext();
                    if (context3 != null) {
                        numLIZJ2 = C1308910kAL.LIZJ(R.attr.ee, context3);
                    }
                    c419910GdJ2.LIZLLL = numLIZJ2;
                    tuxIconView2.setTuxIcon(c419910GdJ2);
                }
            } else if (tuxIconView2 != null) {
                C337180DJs.LIZ(tuxIconView2);
            }
        }
        TuxTextView tuxTextView = (TuxTextView) viewHolder.itemView.findViewById(R.id.kfq);
        View viewFindViewById = viewHolder.itemView.findViewById(R.id.n3g);
        if (viewFindViewById != null && viewFindViewById.getVisibility() == 0) {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
        } else {
            iLIZIZ = 0;
        }
        int iLIZIZ7 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(C196S.LLJJJJLIIL))) - iLIZIZ;
        tuxTextView.getLayoutParams().width = iLIZIZ7;
        C786410Ut5.B5(tuxTextView, 1.0f);
        C786410Ut5.I7(new C19IN() { // from class: X.196c
            @Override // X.C19IN
            public final void LIZ(View view) {
                C196T c196t = this.LLILZLL;
                InterfaceC214845196d interfaceC214845196d2 = c196t.LLILZLL;
                if (interfaceC214845196d2 != null) {
                    interfaceC214845196d2.LIZJ(c196t.LLLLL(i));
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(600, true);
            }
        }, tuxTextView);
        C196X c196xLLLLIIIILLL4 = LLLLIIIILLL(i);
        if (c196xLLLLIIIILLL4 != null) {
            if (!this.LLJJ && (interfaceC214845196d = this.LLILZLL) != null && interfaceC214845196d.LIZIZ()) {
                if (c196xLLLLIIIILLL4.LJFF) {
                    if (C196H.LIZJ(c196xLLLLIIIILLL4.LJI)) {
                        C786410Ut5.LLLLZLL(tuxTextView, 0);
                        LLLIILIL(tuxTextView, iLIZIZ7, C196S.LLJJLIIIJLLLLLLLZ, 1.0f, 0.2f, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(13)), 1.0f, 0.0f, new AwS573S0100000_29(tuxTextView, 272));
                    } else {
                        C786410Ut5.LLLLZLL(tuxTextView, 0);
                        LLLIILIL(tuxTextView, iLIZIZ7, C196S.LLJJLIIIJLLLLLLLZ, 0.2f, 1.0f, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(13)), 0.0f, 1.0f, new AwS563S0100000_19(tuxTextView, 1854));
                    }
                } else if (C196H.LIZJ(c196xLLLLIIIILLL4.LJI)) {
                    tuxTextView.setTextSize(0, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(13))).floatValue() * 0.2f);
                    C786410Ut5.LLLLZLL(tuxTextView, 8);
                    C786410Ut5.B5(tuxTextView, 0.0f);
                    tuxTextView.getLayoutParams().width = (int) (iLIZIZ7 * 0.2f);
                    tuxTextView.getLayoutParams().height = (int) (C196S.LLJJLIIIJLLLLLLLZ * 0.2f);
                } else {
                    C786410Ut5.B5(tuxTextView, 1.0f);
                    C786410Ut5.LLLLZLL(tuxTextView, 0);
                }
            } else {
                C786410Ut5.LLLLZLL(tuxTextView, 8);
            }
        }
        if (C298640BnC.LIZ()) {
            View viewFindViewById2 = viewHolder.itemView.findViewById(R.id.kfs);
            boolean z = ((C196X) ListProtector.get(this.LLILLL, i)).LJIIIZ;
            ViewGroup.LayoutParams layoutParams8 = viewFindViewById2.getLayoutParams();
            if ((layoutParams8 instanceof FrameLayout.LayoutParams) && (layoutParams = (FrameLayout.LayoutParams) layoutParams8) != null) {
                layoutParams.gravity = 8388661;
            }
            int iLIZIZ8 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14));
            ViewGroup.LayoutParams layoutParams9 = viewFindViewById2.getLayoutParams();
            layoutParams9.height = iLIZIZ8;
            layoutParams9.width = iLIZIZ8;
            C426750GoL.LJIIIZ(viewFindViewById2, null, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6))), null, false, 27);
            if (C196H.LIZJ(((C196X) ListProtector.get(this.LLILLL, i)).LJI)) {
                C337180DJs.LIZ(viewFindViewById2);
            } else {
                if (z) {
                    i4 = 0;
                }
                C786410Ut5.LJLLLLLL(i4, viewFindViewById2);
            }
        }
        ((C196X) ListProtector.get(this.LLILLL, i)).LJFF = false;
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        RecyclerView.ViewHolder viewHolderLIZLLL;
        if (i == C12GM.ADD.getType()) {
            viewHolderLIZLLL = new C0DK9(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.cxp, viewGroup, false));
        } else if (i == C12GM.AI_COVER_GENERATING.getType()) {
            AICoverPluginService.LIZ.getClass();
            AICoverPluginService aICoverPluginServiceLIZ = C1446770nkh.LIZ();
            if (aICoverPluginServiceLIZ == null || (viewHolderLIZLLL = aICoverPluginServiceLIZ.LIZLLL(viewGroup)) == null) {
                final FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
                viewHolderLIZLLL = new RecyclerView.ViewHolder(frameLayout) { // from class: X.196b
                };
            }
        } else {
            final FrameLayout frameLayout2 = (FrameLayout) C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.vu, viewGroup, false);
            viewHolderLIZLLL = new RecyclerView.ViewHolder(frameLayout2) { // from class: X.18lY
            };
        }
        try {
            View view = viewHolderLIZLLL.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        viewHolderLIZLLL.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (viewHolderLIZLLL.itemView.getParent() != null) {
                boolean zLIZ = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    zLIZ = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (zLIZ) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(viewHolderLIZLLL.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) viewHolderLIZLLL.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(viewHolderLIZLLL.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = viewHolderLIZLLL.getClass().getName();
        return viewHolderLIZLLL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i, List<Object> list) {
        boolean z;
        if (list.isEmpty()) {
            onBindViewHolder(viewHolder, i);
            return;
        }
        if (viewHolder instanceof C0DK9) {
            return;
        }
        C196X c196x = (C196X) C13LP.LJJJLZIJ(i, this.LLILLL);
        if (c196x != null && c196x.LJ == C12GM.AI_COVER_GENERATING.getType()) {
            if (!(viewHolder instanceof C196Y)) {
                return;
            }
            if (!list.isEmpty()) {
                Iterator<Object> it2 = list.iterator();
                while (it2.hasNext()) {
                    if (it2.next() instanceof AnonymousClass0500) {
                        z = true;
                        break;
                    }
                }
                z = false;
            } else {
                z = false;
            }
            if (!list.isEmpty()) {
                Iterator<Object> it3 = list.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        if (it3.next() instanceof C196P) {
                            LLLJ(((C196Y) viewHolder).A3(), i);
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            if (z) {
                ((C196Y) viewHolder).LLJJLIIIJLLLLLLLZ().setProgress(LLLLII());
            }
            if (!list.isEmpty()) {
                for (Object obj : list) {
                    if (!(obj instanceof AnonymousClass0500) && !(obj instanceof C196P)) {
                        LLLILZLLLI((C196Y) viewHolder, i);
                        return;
                    }
                }
                return;
            }
            return;
        }
        if (!list.isEmpty()) {
            Iterator<Object> it4 = list.iterator();
            while (it4.hasNext()) {
                if (it4.next() instanceof C196P) {
                    LLLJ((TuxTextView) viewHolder.itemView.findViewById(R.id.kfp), i);
                    return;
                }
            }
        }
        onBindViewHolder(viewHolder, i);
    }

    public static void LLLII(C1322110kVd c1322110kVd, int i, float f, float f2) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, f2);
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS64S0101000_2(i, c1322110kVd, 0));
        valueAnimatorOfFloat.setDuration(200L);
        valueAnimatorOfFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimatorOfFloat.start();
    }

    public static void LLLIL(TuxTextView tuxTextView, int i, int i2, Function0 function0) {
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i, i2);
        valueAnimatorOfInt.addUpdateListener(new AUListenerS268S0100000_19(tuxTextView, 9));
        valueAnimatorOfInt.setDuration(200L);
        valueAnimatorOfInt.addListener(new AAListenerS330S0100000_19(function0, 4));
        valueAnimatorOfInt.start();
    }

    public static void LLLIIIIL(C196T c196t, TuxIconView tuxIconView, int i, int i2, float f, float f2, int i3, int i4) {
        c196t.getClass();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, f2);
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS14S0102000_2(tuxIconView, i, i2, 0));
        valueAnimatorOfFloat.setDuration(200L);
        valueAnimatorOfFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i3, i4);
        valueAnimatorOfInt.addUpdateListener(new AUListenerS256S0100000_6(tuxIconView, 38));
        valueAnimatorOfInt.setDuration(200L);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfInt);
        animatorSet.start();
        animatorSet.addListener(new AAListenerS330S0100000_19(null, 5));
        valueAnimatorOfFloat.start();
    }

    public static void LLLIILIL(final TuxTextView tuxTextView, final int i, final int i2, float f, float f2, final float f3, float f4, float f5, Function0 function0) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, f2);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.0hgW
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ViewGroup.LayoutParams layoutParams = tuxTextView.getLayoutParams();
                layoutParams.width = (int) (i * fFloatValue);
                layoutParams.height = (int) (i2 * fFloatValue);
                C786410Ut5.R6(tuxTextView, layoutParams);
                tuxTextView.setTextSize(0, f3 * fFloatValue);
            }
        });
        valueAnimatorOfFloat.setDuration(200L);
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(f4, f5);
        valueAnimatorOfFloat2.addUpdateListener(new AUListenerS268S0100000_19(tuxTextView, 8));
        valueAnimatorOfFloat2.setDuration(200L);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
        animatorSet.start();
        animatorSet.addListener(new AAListenerS330S0100000_19(function0, 3));
    }

    public static void LLLI(final C196Y c196y, final int i, float f, float f2, final int i2, final int i3, float f3, final float f4, final Function1 function1, final Function0 function0) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, f2);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.196Z
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int iFloatValue = (int) (i * ((Float) valueAnimator.getAnimatedValue()).floatValue());
                float animatedFraction = valueAnimator.getAnimatedFraction();
                c196y.T4(iFloatValue, (int) (i2 + ((i3 - r2) * animatedFraction)));
            }
        });
        valueAnimatorOfFloat.setDuration(200L);
        valueAnimatorOfFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(f3, f4);
        valueAnimatorOfFloat2.addUpdateListener(new AUListenerS234S0200000_32(c196y, function1, 2));
        valueAnimatorOfFloat2.setDuration(200L);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
        animatorSet.addListener(new Animator.AnimatorListener() { // from class: X.196V
            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                C786410Ut5.B5(c196y.S3(), f4);
                C786410Ut5.X4(c196y.LLJJLIIIJLLLLLLLZ(), f4);
                Function1<Float, Unit> function12 = function1;
                if (function12 != null) {
                    function12.invoke(Float.valueOf(1.0f));
                }
                Function0<Unit> function02 = function0;
                if (function02 != null) {
                    function02.invoke();
                }
            }
        });
        animatorSet.start();
    }
}
