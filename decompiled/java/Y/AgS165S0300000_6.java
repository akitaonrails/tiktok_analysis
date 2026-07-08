package Y;

import X.C013C;
import X.C05YD;
import X.C05Z7;
import X.C099R;
import X.C0HK0;
import X.C0HOC;
import X.C0HOM;
import X.C0HON;
import X.C0HOP;
import X.C0IDP;
import X.C0P0T;
import X.C0PEM;
import X.C1372405Ys;
import X.C1372505Yt;
import X.C1440005kM;
import X.C1634506ad;
import X.C1754806u2;
import X.C1954807lC;
import X.C1DFH;
import X.C2107308Nj;
import X.C2188811AlT;
import X.C23250099c;
import X.C259800zU;
import X.C437560HDu;
import X.C439170HJz;
import X.C440440HOw;
import X.C452840HpK;
import X.C452880HpO;
import X.C786410Ut5;
import X.EnumC437540HDs;
import X.EnumC452900HpQ;
import X.EnumC452930HpT;
import X.InterfaceC1364105Vn;
import X.InterfaceC2217461Bqa;
import X.InterfaceC346701Wf;
import X.InterfaceC440230HOb;
import android.animation.ValueAnimator;
import android.text.InputFilter;
import android.text.Spanned;
import android.widget.EditText;
import android.widget.TextSwitcher;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.im.chatroom.input.components.record.RecordTipAssem;
import com.ss.android.ugc.aweme.im.common.model.StickerItem;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.suggestedemoji.SuggestedEmojiViewModel;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.typingrecommendation.TypingRecommendationPanelAssem;
import com.ss.android.ugc.aweme.socialavatar.mixstudio.homepage.MixStudioHomePageAssem;
import com.ss.android.ugc.aweme.viewmodel.StickerPanelAssemViewModel;
import irm.AkS25S0300000_6;
import irm.AkS78S0100000_6;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public class AgS165S0300000_6 implements InterfaceC346701Wf {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // X.InterfaceC346701Wf
    public final Object emit(Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        switch (this.$t) {
            case 0:
                return emit$0(this, obj, interfaceC1364105Vn);
            case 1:
                return emit$1(this, obj, interfaceC1364105Vn);
            case 2:
                return emit$2(this, obj, interfaceC1364105Vn);
            case 3:
                return emit$3(this, obj, interfaceC1364105Vn);
            case 4:
                return emit$4(this, obj, interfaceC1364105Vn);
            case 5:
                return emit$5(this, obj, interfaceC1364105Vn);
            case 6:
                return emit$6(this, obj, interfaceC1364105Vn);
            default:
                return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ$0(X.C0HOM<? extends java.util.List<X.C440440HOw>> r9, X.InterfaceC1364105Vn<? super kotlin.Unit> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof X.C0HP3
            if (r0 == 0) goto L27
            r7 = r10
            X.0HP3 r7 = (X.C0HP3) r7
            int r2 = r7.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L27
            int r2 = r2 - r1
            r7.LLILLL = r2
        L12:
            java.lang.Object r1 = r7.LL
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r7.LLILLL
            r5 = 1
            if (r0 == 0) goto L2d
            if (r0 == r5) goto L67
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L27:
            X.0HP3 r7 = new X.0HP3
            r7.<init>(r8, r10)
            goto L12
        L2d:
            X.C155000ia.LIZIZ(r1)
            boolean r0 = r9 instanceof X.C1372505Yt
            if (r0 == 0) goto L43
            java.lang.Object r0 = r8.l0
            com.ss.android.ugc.aweme.socialavatar.mixstudio.homepage.MixStudioHomePageAssem r0 = (com.ss.android.ugc.aweme.socialavatar.mixstudio.homepage.MixStudioHomePageAssem) r0
            com.ss.android.ugc.aweme.socialavatar.mixstudio.homepage.MixStudioHomePageViewModel r1 = r0.mp()
            r0 = 0
            r1.vQ2(r0)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L43:
            boolean r0 = r9 instanceof X.C1372405Ys
            if (r0 == 0) goto L70
            java.lang.Object r0 = r8.l1
            X.0HOb r0 = (X.InterfaceC440230HOb) r0
            X.05YD r4 = r0.getState()
            Y.AgS197S0200000_6 r3 = new Y.AgS197S0200000_6
            java.lang.Object r2 = r8.l0
            com.ss.android.ugc.aweme.socialavatar.mixstudio.homepage.MixStudioHomePageAssem r2 = (com.ss.android.ugc.aweme.socialavatar.mixstudio.homepage.MixStudioHomePageAssem) r2
            java.lang.Object r1 = r8.l2
            X.0HOb r1 = (X.InterfaceC440230HOb) r1
            r0 = 14
            r3.<init>(r2, r1, r0)
            r7.LLILLL = r5
            java.lang.Object r0 = r4.collect(r3, r7)
            if (r0 != r6) goto L6a
            return r6
        L67:
            X.C155000ia.LIZIZ(r1)
        L6a:
            X.08jB r0 = new X.08jB
            r0.<init>()
            throw r0
        L70:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AgS165S0300000_6.LIZ$0(X.0HOM, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1, types: [T, X.0HpK] */
    public static final Object emit$0(AgS165S0300000_6 agS165S0300000_6, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        String str;
        String str2;
        ?? r7 = (C452840HpK) obj;
        if (r7.LIZ && (!r7.LIZIZ.isEmpty())) {
            String str3 = r7.LIZJ;
            C452840HpK c452840HpK = (C452840HpK) ((C259800zU) agS165S0300000_6.l0).element;
            if (c452840HpK != null) {
                str = c452840HpK.LIZJ;
            } else {
                str = null;
            }
            boolean z = !Intrinsics.LJFF(str3, str);
            if (!((C013C) agS165S0300000_6.l1).element) {
                ((TypingRecommendationPanelAssem) agS165S0300000_6.l2).xo();
                TypingRecommendationPanelAssem typingRecommendationPanelAssem = (TypingRecommendationPanelAssem) agS165S0300000_6.l2;
                int i = C452880HpO.LIZ[((EnumC452900HpQ) typingRecommendationPanelAssem.so().LLILZ.getValue()).ordinal()];
                if (i != 1) {
                    if (i == 2) {
                        typingRecommendationPanelAssem.ko();
                        typingRecommendationPanelAssem.m240do(r7);
                    } else {
                        throw new C1954807lC();
                    }
                } else {
                    typingRecommendationPanelAssem.lo();
                    typingRecommendationPanelAssem.bo(r7);
                }
                if (r7.LJFF != EnumC452930HpT.LL) {
                    TypingRecommendationPanelAssem typingRecommendationPanelAssem2 = (TypingRecommendationPanelAssem) agS165S0300000_6.l2;
                    List<StickerItem> list = r7.LIZIZ;
                    typingRecommendationPanelAssem2.LLJILLL = null;
                    typingRecommendationPanelAssem2.LLJJ = null;
                    typingRecommendationPanelAssem2.Co(list);
                }
                ((TypingRecommendationPanelAssem) agS165S0300000_6.l2).Ao(r7);
            } else if (z) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("panelState: UPDATE (data changed), querySessionId: ");
                C452840HpK c452840HpK2 = (C452840HpK) ((C259800zU) agS165S0300000_6.l0).element;
                if (c452840HpK2 != null) {
                    str2 = c452840HpK2.LIZJ;
                } else {
                    str2 = null;
                }
                sbLIZ.append(str2);
                sbLIZ.append("->");
                sbLIZ.append(r7.LIZJ);
                sbLIZ.append(", renderMode=");
                sbLIZ.append(((TypingRecommendationPanelAssem) agS165S0300000_6.l2).so().LLILZ.getValue());
                sbLIZ.append(", isFakeMsgInserted=");
                sbLIZ.append(((TypingRecommendationPanelAssem) agS165S0300000_6.l2).LLJJJIL);
                sbLIZ.append(", isFloatingActive=");
                sbLIZ.append(((TypingRecommendationPanelAssem) agS165S0300000_6.l2).LLJJJJ);
                C2188811AlT.LIZIZ(sbLIZ);
                TypingRecommendationPanelAssem typingRecommendationPanelAssem3 = (TypingRecommendationPanelAssem) agS165S0300000_6.l2;
                C0P0T c0p0t = typingRecommendationPanelAssem3.LLJJIJI;
                if (c0p0t != null) {
                    c0p0t.dismiss();
                }
                typingRecommendationPanelAssem3.LLJJIJI = null;
                TypingRecommendationPanelAssem typingRecommendationPanelAssem4 = (TypingRecommendationPanelAssem) agS165S0300000_6.l2;
                C452840HpK c452840HpK3 = (C452840HpK) ((C259800zU) agS165S0300000_6.l0).element;
                typingRecommendationPanelAssem4.getClass();
                TypingRecommendationPanelAssem.zo(c452840HpK3);
                if (r7.LJFF != EnumC452930HpT.LL) {
                    TypingRecommendationPanelAssem typingRecommendationPanelAssem5 = (TypingRecommendationPanelAssem) agS165S0300000_6.l2;
                    List<StickerItem> list2 = r7.LIZIZ;
                    typingRecommendationPanelAssem5.LLJILLL = null;
                    typingRecommendationPanelAssem5.LLJJ = null;
                    typingRecommendationPanelAssem5.Co(list2);
                }
                ((TypingRecommendationPanelAssem) agS165S0300000_6.l2).Ao(r7);
                ((TypingRecommendationPanelAssem) agS165S0300000_6.l2).xo();
                TypingRecommendationPanelAssem typingRecommendationPanelAssem6 = (TypingRecommendationPanelAssem) agS165S0300000_6.l2;
                int i2 = C452880HpO.LIZ[((EnumC452900HpQ) typingRecommendationPanelAssem6.so().LLILZ.getValue()).ordinal()];
                if (i2 != 1) {
                    if (i2 == 2) {
                        typingRecommendationPanelAssem6.ko();
                        if (typingRecommendationPanelAssem6.LLJJJJ) {
                            typingRecommendationPanelAssem6.Bo(r7);
                        } else {
                            typingRecommendationPanelAssem6.m240do(r7);
                        }
                    } else {
                        throw new C1954807lC();
                    }
                } else if (!typingRecommendationPanelAssem6.LLJILJILJ.LJFF) {
                    typingRecommendationPanelAssem6.lo();
                    if (typingRecommendationPanelAssem6.LLJJJIL) {
                        typingRecommendationPanelAssem6.Bo(r7);
                    } else {
                        typingRecommendationPanelAssem6.bo(r7);
                    }
                }
            }
            ((C259800zU) agS165S0300000_6.l0).element = r7;
            ((C013C) agS165S0300000_6.l1).element = true;
        } else {
            if (((C013C) agS165S0300000_6.l1).element) {
                TypingRecommendationPanelAssem typingRecommendationPanelAssem7 = (TypingRecommendationPanelAssem) agS165S0300000_6.l2;
                C0P0T c0p0t2 = typingRecommendationPanelAssem7.LLJJIJI;
                if (c0p0t2 != null) {
                    c0p0t2.dismiss();
                }
                typingRecommendationPanelAssem7.LLJJIJI = null;
                TypingRecommendationPanelAssem typingRecommendationPanelAssem8 = (TypingRecommendationPanelAssem) agS165S0300000_6.l2;
                C452840HpK c452840HpK4 = (C452840HpK) ((C259800zU) agS165S0300000_6.l0).element;
                typingRecommendationPanelAssem8.getClass();
                TypingRecommendationPanelAssem.zo(c452840HpK4);
                ((TypingRecommendationPanelAssem) agS165S0300000_6.l2).ho();
                AssemVMLazy assemVMLazy = ((TypingRecommendationPanelAssem) agS165S0300000_6.l2).LLIZLLLIL;
                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = TypingRecommendationPanelAssem.LLJJL;
                ((SuggestedEmojiViewModel) assemVMLazy.getValue()).rU();
            }
            ((C013C) agS165S0300000_6.l1).element = false;
            ((C259800zU) agS165S0300000_6.l0).element = null;
        }
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object emit$1(AgS165S0300000_6 agS165S0300000_6, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        return agS165S0300000_6.LIZ$0((C0HOM) obj, interfaceC1364105Vn);
    }

    public static final Object emit$2(AgS165S0300000_6 agS165S0300000_6, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) throws Throwable {
        boolean z;
        if (obj instanceof C1372405Ys) {
            C0HOC c0hoc = (C0HOC) agS165S0300000_6.l0;
            if (c0hoc != null) {
                MixStudioHomePageAssem mixStudioHomePageAssem = (MixStudioHomePageAssem) agS165S0300000_6.l1;
                ConstraintLayout constraintLayout = mixStudioHomePageAssem.LLLFZ;
                if (constraintLayout != null || (constraintLayout = mixStudioHomePageAssem.LLLIIIIL) != null) {
                    C786410Ut5.I7(new AkS25S0300000_6(mixStudioHomePageAssem, c0hoc, (InterfaceC440230HOb) agS165S0300000_6.l2, 1), constraintLayout);
                }
            } else {
                MixStudioHomePageAssem mixStudioHomePageAssem2 = (MixStudioHomePageAssem) agS165S0300000_6.l1;
                ConstraintLayout constraintLayout2 = mixStudioHomePageAssem2.LLLFZ;
                if (constraintLayout2 != null) {
                    C786410Ut5.I7(new AkS78S0100000_6(mixStudioHomePageAssem2, 18), constraintLayout2);
                }
            }
        } else {
            MixStudioHomePageAssem mixStudioHomePageAssem3 = (MixStudioHomePageAssem) agS165S0300000_6.l1;
            ConstraintLayout constraintLayout3 = mixStudioHomePageAssem3.LLLFZ;
            if (constraintLayout3 != null) {
                C786410Ut5.I7(new AkS78S0100000_6(mixStudioHomePageAssem3, 17), constraintLayout3);
            }
        }
        if (!Intrinsics.LJFF(obj, C1372505Yt.LIZIZ) && !Intrinsics.LJFF(obj, C0HON.LIZIZ) && !(obj instanceof C05Z7)) {
            z = false;
        } else {
            z = true;
        }
        C1DFH c1dfh = C0PEM.LIZ;
        Object objLJI = C23250099c.LJI(interfaceC1364105Vn, C2107308Nj.LIZ, new C0HOP((MixStudioHomePageAssem) agS165S0300000_6.l1, z, (C0HOC) agS165S0300000_6.l0, null));
        if (objLJI != C099R.LJFF()) {
            return Unit.LIZ;
        }
        return objLJI;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object emit$3(AgS165S0300000_6 agS165S0300000_6, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        boolean z;
        EnumC437540HDs enumC437540HDs;
        C437560HDu c437560HDu;
        if (Intrinsics.LJFF(((C259800zU) agS165S0300000_6.l0).element, obj)) {
            return Unit.LIZ;
        }
        C259800zU c259800zU = (C259800zU) agS165S0300000_6.l1;
        C259800zU c259800zU2 = (C259800zU) agS165S0300000_6.l0;
        c259800zU.element = c259800zU2.element;
        c259800zU2.element = obj;
        if ((c259800zU.element instanceof C439170HJz) && (obj instanceof C0HK0)) {
            z = true;
        } else {
            z = false;
        }
        C1440005kM.LIZ(new C1634506ad(false, z, 1));
        T t = ((C259800zU) agS165S0300000_6.l1).element;
        if (((t instanceof C439170HJz) || (t instanceof C0HK0)) && (obj instanceof C1754806u2)) {
            C05YD c05yd = (C05YD) ((StickerPanelAssemViewModel) agS165S0300000_6.l2).LLILZLL.getValue();
            if (c05yd != null && (c437560HDu = (C437560HDu) c05yd.getValue()) != null) {
                enumC437540HDs = c437560HDu.LIZ;
            } else {
                enumC437540HDs = null;
            }
            if (enumC437540HDs == EnumC437540HDs.DELETED) {
                C1440005kM.LIZ(new C1634506ad(true, false, 2));
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [T, android.text.InputFilter[]] */
    public static final Object emit$4(AgS165S0300000_6 agS165S0300000_6, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        if (((Boolean) obj).booleanValue()) {
            ((C259800zU) agS165S0300000_6.l0).element = ((EditText) agS165S0300000_6.l1).getFilters();
            ((C013C) agS165S0300000_6.l2).element = ((EditText) agS165S0300000_6.l1).isFocused();
            ((EditText) agS165S0300000_6.l1).setFilters(new InputFilter[]{new InputFilter() { // from class: X.0HVE
                @Override // android.text.InputFilter
                public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
                    return "";
                }
            }});
        } else {
            ((EditText) agS165S0300000_6.l1).setFilters((InputFilter[]) ((C259800zU) agS165S0300000_6.l0).element);
            if (((C013C) agS165S0300000_6.l2).element) {
                EditText editText = (EditText) agS165S0300000_6.l1;
                if (editText.isLaidOut() && !editText.isLayoutRequested()) {
                    editText.requestFocus();
                } else {
                    editText.addOnLayoutChangeListener(new C0IDP(editText, 15));
                }
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [T, android.animation.ValueAnimator] */
    public static final Object emit$5(AgS165S0300000_6 agS165S0300000_6, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        ValueAnimator valueAnimator = (ValueAnimator) ((C259800zU) agS165S0300000_6.l0).element;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        C259800zU c259800zU = (C259800zU) agS165S0300000_6.l0;
        RecordTipAssem recordTipAssem = (RecordTipAssem) agS165S0300000_6.l1;
        TextSwitcher textSwitcher = (TextSwitcher) agS165S0300000_6.l2;
        recordTipAssem.getClass();
        c259800zU.element = RecordTipAssem.ip(zBooleanValue, textSwitcher);
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [T, android.animation.ValueAnimator] */
    public static final Object emit$6(AgS165S0300000_6 agS165S0300000_6, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        ValueAnimator valueAnimator = (ValueAnimator) ((C259800zU) agS165S0300000_6.l0).element;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        C259800zU c259800zU = (C259800zU) agS165S0300000_6.l0;
        RecordTipAssem recordTipAssem = (RecordTipAssem) agS165S0300000_6.l1;
        TextSwitcher textSwitcher = (TextSwitcher) agS165S0300000_6.l2;
        recordTipAssem.getClass();
        c259800zU.element = RecordTipAssem.ip(zBooleanValue, textSwitcher);
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AgS165S0300000_6(Object obj, MixStudioHomePageAssem mixStudioHomePageAssem, InterfaceC440230HOb<? extends List<C440440HOw>> interfaceC440230HOb, InterfaceC440230HOb<? extends List<C440440HOw>> interfaceC440230HOb2) {
        this.$t = interfaceC440230HOb2;
        this.l0 = obj;
        this.l1 = mixStudioHomePageAssem;
        this.l2 = interfaceC440230HOb;
    }
}
