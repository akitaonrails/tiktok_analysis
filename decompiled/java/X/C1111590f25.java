package X;

import Y.ACListenerS142S0100000_7;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.publicscreen.api.IPublicScreenService;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveCapsuleStyleSetting;
import com.bytedance.android.livesdk.livesetting.publicscreen.LivePublicScreenXmlLayerOptSetting;
import com.bytedance.android.livesdk.model.message.CapsuleMessage;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: renamed from: X.0f25, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1111590f25 extends AbstractC1111600f26 {
    public final boolean LLILZIL;

    @Override // X.AbstractC1111600f26
    public final void LLLIL() {
        LLLIILIL();
        this.LLILLJJLI.LIZJ(InterfaceC1113740f5Y.class);
        C1117380fBQ c1117380fBQ = new C1117380fBQ(this, InterfaceC1113740f5Y.class);
        C1111640f2A c1111640f2A = new C1111640f2A();
        c1111640f2A.LIZIZ = LLLIIIIL();
        C1111640f2A c1111640f2A2 = new C1111640f2A() { // from class: X.0f29
            @Override // X.AbstractC1111810f2R
            public final boolean LJIIL() {
                return LivePublicScreenXmlLayerOptSetting.INSTANCE.enableLayerOpt(LJIIJJI().LJI);
            }

            @Override // X.C1111640f2A, X.AbstractC1111810f2R
            public final int LJIIIIZZ() {
                Boolean bool;
                DataChannel dataChannel = LJIIJJI().LJIIIZ;
                return (dataChannel == null || (bool = (Boolean) dataChannel.gg0(C0TZM.class)) == null || bool.booleanValue()) ? R.layout.gpt : R.layout.gq5;
            }
        };
        c1111640f2A2.LIZIZ = LLLIIIIL();
        C1111640f2A c1111640f2A3 = new C1111640f2A() { // from class: X.0f28
            @Override // X.AbstractC1111810f2R
            public final boolean LJIIL() {
                return LivePublicScreenXmlLayerOptSetting.INSTANCE.enableLayerOpt(LJIIJJI().LJI);
            }

            @Override // X.C1111640f2A, X.AbstractC1111810f2R
            public final int LJIIIIZZ() {
                Boolean bool;
                DataChannel dataChannel = LJIIJJI().LJIIIZ;
                return (dataChannel == null || (bool = (Boolean) dataChannel.gg0(C0TZM.class)) == null || bool.booleanValue()) ? R.layout.gpu : R.layout.gq5;
            }

            @Override // X.C1111640f2A, X.AbstractC1111810f2R
            public final AbstractC1111020f1A LJIILJJIL(View view) {
                return new C1113720f5W(view);
            }

            @Override // X.C1111640f2A
            /* JADX INFO: renamed from: LJIIZILJ */
            public final C1113730f5X LJIILJJIL(View view) {
                return new C1113720f5W(view);
            }
        };
        c1111640f2A3.LIZIZ = LLLIIIIL();
        c1117380fBQ.LIZJ = new C0J8P[]{c1111640f2A, c1111640f2A2, c1111640f2A3};
        c1117380fBQ.LIZ(new InterfaceC1112620f3k() { // from class: X.0f27
            @Override // X.InterfaceC1112620f3k
            public final int LIZ(Object obj) {
                C1112330f3H c1112330f3H;
                boolean z;
                Boolean boolValueOf;
                boolean zBooleanValue;
                boolean z2;
                InterfaceC1113740f5Y interfaceC1113740f5Y = (InterfaceC1113740f5Y) obj;
                boolean z3 = interfaceC1113740f5Y instanceof C1112330f3H;
                C1112330f3H c1112330f3H2 = null;
                if (z3) {
                    c1112330f3H2 = (C1112330f3H) interfaceC1113740f5Y;
                }
                if (c1112330f3H2 != null && c1112330f3H2.LLJLILLLLZIIL(this.LIZ.LLILZIL)) {
                    return 2;
                }
                if (!z3 || (c1112330f3H = (C1112330f3H) interfaceC1113740f5Y) == null) {
                    return 0;
                }
                Boolean bool = c1112330f3H.LJJIIZI;
                if (bool != null) {
                    zBooleanValue = bool.booleanValue();
                } else {
                    List<InterfaceC1112400f3O> listZ51 = ((IPublicScreenService) C1161920gLG.LIZJ(IPublicScreenService.class)).Z51(((CapsuleMessage) c1112330f3H.LJIL).capsuleType);
                    if (listZ51 != null) {
                        if (!listZ51.isEmpty()) {
                            for (InterfaceC1112400f3O interfaceC1112400f3O : listZ51) {
                                if (interfaceC1112400f3O != null && interfaceC1112400f3O.LJJIIZ(c1112330f3H)) {
                                    z2 = true;
                                    break;
                                }
                            }
                            z2 = false;
                            boolValueOf = Boolean.valueOf(z2);
                        } else {
                            z2 = false;
                            boolValueOf = Boolean.valueOf(z2);
                        }
                    } else {
                        int i = C1112330f3H.LJJIZ;
                        if (LiveCapsuleStyleSetting.INSTANCE.getValue() == 0 && ((CapsuleMessage) c1112330f3H.LJIL).style > 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        boolValueOf = Boolean.valueOf(z);
                    }
                    c1112330f3H.LJJIIZI = boolValueOf;
                    zBooleanValue = boolValueOf.booleanValue();
                }
                if (!zBooleanValue) {
                    return 0;
                }
                return 1;
            }
        });
        LLLILZ(AbstractC1110520f0M.class, new AbstractC1111540f20<AbstractC1110520f0M<? extends AbstractC1136060ffY>, C1111130f1L>() { // from class: X.0f24
            @Override // X.AbstractC1111810f2R
            public final String LJIIJ() {
                return "chat";
            }

            @Override // X.AbstractC1111810f2R
            public final int LJIIIIZZ() {
                return LJIIJJI().LIZLLL ? R.layout.hk1 : R.layout.hk0;
            }

            @Override // X.AbstractC1111810f2R
            public final AbstractC1111020f1A LJIILJJIL(View view) {
                return new C1111130f1L(view, LJIIZILJ(view), LJIIJJI().LIZLLL, false, LJIIJJI().LJI);
            }
        });
        LLLILZ(AbstractC519260KYa.class, new AbstractC1111810f2R<AbstractC519260KYa<? extends AbstractC1136060ffY>, C0KYZ>() { // from class: X.0f2F
            @Override // X.AbstractC1111810f2R
            public final int LJIIIIZZ() {
                return R.layout.hl1;
            }

            @Override // X.AbstractC1111810f2R
            public final String LJIIJ() {
                return "action";
            }

            @Override // X.AbstractC1111810f2R
            public final AbstractC1111020f1A LJIILJJIL(View view) {
                return new AbstractC1110760f0k<AbstractC519260KYa<? extends AbstractC1136060ffY>>(view) { // from class: X.0KYZ
                    public final ImageView LLILZ;
                    public final ImageView LLILZIL;
                    public final TextView LLILZLL;
                    public final View LLIZ;
                    public final ACListenerS142S0100000_7 LLIZLLLIL;

                    {
                        super(view);
                        this.LLILZ = (ImageView) view.findViewById(R.id.jxe);
                        this.LLILZIL = (ImageView) view.findViewById(R.id.tld);
                        this.LLILZLL = (TextView) view.findViewById(R.id.eu1);
                        this.LLIZ = view.findViewById(R.id.pfo);
                        this.LLIZLLLIL = new ACListenerS142S0100000_7(this, 337);
                    }

                    @Override // X.AbstractC1111020f1A
                    public final void L5(C1109770ez9 c1109770ez9, InterfaceC1112060f2q interfaceC1112060f2q) {
                        AbstractC519260KYa abstractC519260KYa = (AbstractC519260KYa) interfaceC1112060f2q;
                        if (abstractC519260KYa.LLJZ() != null) {
                            C1121670fIL.LJFF(this.LLILZ, abstractC519260KYa.LLJZ(), this.LLILZ.getWidth(), this.LLILZ.getHeight());
                        } else {
                            abstractC519260KYa.LLJLL();
                            this.LLILZ.setBackgroundResource(R.drawable.eqj);
                        }
                        abstractC519260KYa.LLJLLIL();
                        if (!abstractC519260KYa.LLJZIJLIL()) {
                            C786410Ut5.LJZI(8, this.LLILZIL);
                        }
                        if (!TextUtils.isEmpty(abstractC519260KYa.getContent())) {
                            this.LLILZLL.setText(abstractC519260KYa.getContent());
                        } else {
                            this.LLILZLL.setText("");
                        }
                        abstractC519260KYa.LLJLLL();
                        if (!TextUtils.isEmpty(abstractC519260KYa.LLJLILLLLZIIL())) {
                            try {
                                ((GradientDrawable) this.LLIZ.getBackground()).setColor(Color.parseColor(abstractC519260KYa.LLJLILLLLZIIL()));
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                            }
                        }
                        if (abstractC519260KYa.LLJZIJLIL()) {
                            this.itemView.setTag(abstractC519260KYa);
                            C786410Ut5.I7(this.LLIZLLLIL, this.itemView);
                            return;
                        }
                        C786410Ut5.I7(null, this.itemView);
                    }
                };
            }
        });
        this.LLILLJJLI.LIZJ(AbstractC1110800f0o.class);
        C1117380fBQ c1117380fBQ2 = new C1117380fBQ(this, AbstractC1110800f0o.class);
        AbstractC1111810f2R abstractC1111810f2R = new AbstractC1111540f20<MODEL, C1110930f11<MODEL>>() { // from class: X.0f21
            @Override // X.AbstractC1111810f2R
            public final int LJIIIIZZ() {
                return R.layout.hk4;
            }

            @Override // X.AbstractC1111810f2R
            public final String LJIIJ() {
                return "greeting_common";
            }

            @Override // X.AbstractC1111810f2R
            public final LayoutInflater LJIIIZ(LayoutInflater layoutInflater) {
                return C1834150xpV.LIZJ(layoutInflater);
            }

            @Override // X.AbstractC1111810f2R
            public final AbstractC1111020f1A LJIILJJIL(View view) {
                return new C1110930f11(view, LJIIZILJ(view), LJIIJJI().LIZLLL, LJIIJJI().LJJ, LJIIJJI().LJI);
            }
        };
        abstractC1111810f2R.LIZIZ = LLLIIIIL();
        C1111560f22 c1111560f22 = new C1111560f22(false);
        c1111560f22.LIZIZ = LLLIIIIL();
        c1117380fBQ2.LIZJ = new C0J8P[]{abstractC1111810f2R, c1111560f22};
        c1117380fBQ2.LIZ(new InterfaceC1112620f3k() { // from class: X.0f2E
            @Override // X.InterfaceC1112620f3k
            public final int LIZ(Object obj) {
                return !((AbstractC1110790f0n) obj).LJJIIZI() ? 1 : 0;
            }
        });
        LLLILZ(C176500m3.class, new AbstractC1111810f2R<C176500m3, C1111270f1Z>() { // from class: X.0f1g
            @Override // X.AbstractC1111810f2R
            public final int LJIIIIZZ() {
                return R.layout.hk7;
            }

            @Override // X.AbstractC1111810f2R
            public final AbstractC1111020f1A LJIILJJIL(View view) {
                return new C1111270f1Z(view);
            }
        });
        LLLILZ(C160900jX.class, new AbstractC1111810f2R<C160900jX, C1111160f1O>() { // from class: X.0f1v
            @Override // X.AbstractC1111810f2R
            public final String LJIIJ() {
                return "ai_summary_common";
            }

            @Override // X.AbstractC1111810f2R
            public final int LJIIIIZZ() {
                return LJIIJJI().LIZLLL ? R.layout.hk2 : R.layout.hk3;
            }

            @Override // X.AbstractC1111810f2R
            public final LayoutInflater LJIIIZ(LayoutInflater layoutInflater) {
                return C1834150xpV.LIZJ(layoutInflater);
            }

            @Override // X.AbstractC1111810f2R
            public final AbstractC1111020f1A LJIILJJIL(View view) {
                return new C1111160f1O(view, LJIIJJI().LIZLLL, LJIIJJI().LJJ, LJIIJJI().LJI);
            }
        });
        LLLILZ(C1110490f0J.class, new AbstractC1111810f2R<C1110490f0J, C1111120f1K>() { // from class: X.0f1s
            @Override // X.AbstractC1111810f2R
            public final String LJIIJ() {
                return "enigma_whisper_common";
            }

            @Override // X.AbstractC1111810f2R
            public final int LJIIIIZZ() {
                return LJIIJJI().LIZLLL ? R.layout.gfp : R.layout.gfq;
            }

            @Override // X.AbstractC1111810f2R
            public final LayoutInflater LJIIIZ(LayoutInflater layoutInflater) {
                return C1834150xpV.LIZJ(layoutInflater);
            }

            @Override // X.AbstractC1111810f2R
            public final AbstractC1111020f1A LJIILJJIL(View view) {
                return new C1111120f1K(view, view, LJIIJJI().LIZLLL, LJIIJJI().LJJ, LJIIJJI().LJI);
            }
        });
        LLLILZ(C1110640f0Y.class, new AbstractC1111810f2R<C1110640f0Y, C1111140f1M>() { // from class: X.0f1u
            @Override // X.AbstractC1111810f2R
            public final int LJIIIIZZ() {
                return R.layout.hjz;
            }

            @Override // X.AbstractC1111810f2R
            public final String LJIIJ() {
                return "ai_reply_assistant";
            }

            @Override // X.AbstractC1111810f2R
            public final LayoutInflater LJIIIZ(LayoutInflater layoutInflater) {
                return C1834150xpV.LIZJ(layoutInflater);
            }

            @Override // X.AbstractC1111810f2R
            public final AbstractC1111020f1A LJIILJJIL(View view) {
                return new C1111140f1M(view, LJIIJJI().LIZLLL, LJIIJJI().LJJ, LJIIJJI().LJI);
            }
        });
    }

    public C1111590f25(boolean z) {
        this.LLILZIL = z;
    }
}
