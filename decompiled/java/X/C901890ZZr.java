package X;

import Y.ACListenerS149S0100000_14;
import Y.ARunnableS106S0100000_6;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.status.loading.TuxSpinner;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate;
import com.ss.android.ugc.aweme.im.message.template.component.ActionLinkComponent;
import com.ss.android.ugc.aweme.im.message.template.component.ActionLinkType;
import com.ss.android.ugc.aweme.im.message.template.component.IconTypeComponent;
import com.ss.android.ugc.aweme.im.message.template.component.ImageComponent;
import com.ss.android.ugc.aweme.im.message.template.component.ResolutionComponent;
import com.ss.android.ugc.aweme.im.message.template.component.TextComponent;
import com.ss.android.ugc.aweme.im.saas.host.api.airemix.IMAIRemixBridgeApi;
import com.ss.android.ugc.aweme.im.saas.host.api.debug.IMSaasHostOfflineDebugService;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.camera.ChatRoomCameraVM;
import com.ss.android.ugc.aweme.im.service.analytics.IIMAnalyticsUtil;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS201S0000000_14;
import kotlin.jvm.internal.AFwS248S0000000_14;
import kotlin.jvm.internal.AwS223S0300000_14;
import kotlin.jvm.internal.AwS415S0200000_14;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.jvm.internal.AwS593S0100000_14;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZZr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C901890ZZr implements C09KS<C09KK> {
    public static final int LLJJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40));
    public SessionInfo LL;
    public final InterfaceC902110ZaD LLILLJJLI;
    public final View LLILLL;
    public final Function1<C869590Y9l, Unit> LLILZ;
    public final Function2<View, Boolean, Unit> LLILZIL;
    public final Function0<Boolean> LLILZLL;
    public final Function0<Unit> LLIZ;
    public C869590Y9l LLJ;
    public C2242281CpW LLJIJIL;
    public boolean LLJILJIL;
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 960));
    public final C01GW LLJI = C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(228));
    public final C2252321DDq LLJILJILJ = C1BNE.LIZ(EnumC901970ZZz.LL);
    public final C2252321DDq LLJILLL = C1BNE.LIZ(C0ZSW.NO_MASK);
    public InterfaceC902100ZaC LLJJ = C902140ZaG.LIZ;

    @Override // X.C09KS
    public final void Uj(C0OPV c0opv) {
    }

    @Override // X.C09KS
    public final void Z3(C912060ZqG c912060ZqG) {
    }

    @Override // X.C09KS
    public final void l1(C09KK c09kk) {
    }

    @Override // X.C09KS
    public final void m4(String str) {
    }

    public final String LIZIZ() {
        InterfaceC876950Yaj interfaceC876950YajLIZIZ = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ);
        C869590Y9l c869590Y9l = this.LLJ;
        C0Y8T c0y8tLIZ = interfaceC876950YajLIZIZ.LIZ(c869590Y9l != null ? c869590Y9l.getConversationId() : null);
        return (c0y8tLIZ == null || !c0y8tLIZ.isRisky()) ? "chat" : "filtered_message_request";
    }

    public final C901900ZZs LIZJ() {
        return (C901900ZZs) this.LLIZLLLIL.getValue();
    }

    public final void LJIILIIL() {
        String str;
        String str2;
        InterfaceC902100ZaC interfaceC902100ZaC = this.LLJJ;
        if (interfaceC902100ZaC instanceof C901960ZZy) {
            str = "ErrorState";
        } else if (interfaceC902100ZaC instanceof C902040Za6) {
            str = "FinalImageState";
        } else if (Intrinsics.LJFF(interfaceC902100ZaC, C902140ZaG.LIZ)) {
            str = "LoadingState";
        } else if (interfaceC902100ZaC instanceof C902050Za7) {
            str = "TikTokLogoPlaceholderState";
        } else {
            if (!(interfaceC902100ZaC instanceof C902080ZaA)) {
                throw new C1954807lC();
            }
            str = "UploadState";
        }
        InterfaceC902110ZaD interfaceC902110ZaD = this.LLILLJJLI;
        if (Intrinsics.LJFF(interfaceC902110ZaD, C902000Za2.LIZ)) {
            str2 = "photo";
        } else {
            if (!Intrinsics.LJFF(interfaceC902110ZaD, C902010Za3.LIZ)) {
                throw new C1954807lC();
            }
            str2 = "video";
        }
        C912070ZqH.LIZIZ.LJFF().LJI(str, str2, C0I0B.LJFF.LIZIZ());
    }

    public final void LJIILJJIL() {
        C869590Y9l c869590Y9l = this.LLJ;
        if (c869590Y9l == null) {
            return;
        }
        Iterable iterable = (Iterable) this.LLJI.getValue();
        C869590Y9l c869590Y9l2 = this.LLJ;
        if (C13LP.LJJJJ(c869590Y9l2 != null ? Integer.valueOf(c869590Y9l2.getMsgStatus()) : null, iterable)) {
            C912070ZqH.LIZIZ.LJIILIIL().LJIIIZ().LIZIZ(this, c869590Y9l.getUuid());
        }
    }

    public final void LJIILL() {
        String uuid;
        C869590Y9l c869590Y9l = this.LLJ;
        if (c869590Y9l == null || (uuid = c869590Y9l.getUuid()) == null) {
            return;
        }
        C912070ZqH.LIZIZ.LJIILIIL().LJIIIZ().LJIIJJI(this, uuid);
    }

    public final void LJII() {
        C339190DRl.LIZIZ(LIZJ().LJIILLIIL);
        C339190DRl.LIZIZ(LIZJ().LJIIZILJ);
        C339190DRl.LIZIZ(LIZJ().LJI);
        View view = LIZJ().LJJ;
        if (view != null) {
            C339190DRl.LIZIZ(view);
        }
    }

    public final void LJFF(String str) {
        LJIIJ(new C902040Za6(C0ZSW.NO_MASK));
    }

    public final void LJIIIIZZ(List<ResolutionComponent> list) {
        Object next;
        Iterator it2 = ((ArrayList) list).iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                ResolutionComponent resolutionComponent = (ResolutionComponent) next;
                if (resolutionComponent.height != 0 && resolutionComponent.width != 0) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        LIZJ().LIZIZ.setResolution((ResolutionComponent) next);
    }

    public final void LJIIJ(InterfaceC902100ZaC interfaceC902100ZaC) {
        this.LLJJ = interfaceC902100ZaC;
        C901900ZZs c901900ZZsLIZJ = LIZJ();
        View view = c901900ZZsLIZJ.LJIIJ;
        if (view != null) {
            C786410Ut5.LJLLLLLL(8, view);
        }
        C426320Gne c426320Gne = c901900ZZsLIZJ.LJIIJJI;
        if (c426320Gne != null) {
            C786410Ut5.LLLZZ(c426320Gne, 8);
        }
        TuxTextView tuxTextView = c901900ZZsLIZJ.LJIIL;
        if (tuxTextView != null) {
            C786410Ut5.LLLLZLL(tuxTextView, 8);
        }
        C786410Ut5.LJLLLLLL(8, c901900ZZsLIZJ.LJIILIIL);
        C786410Ut5.LJLLLLLL(8, c901900ZZsLIZJ.LJIILL);
        TuxSpinner tuxSpinner = c901900ZZsLIZJ.LJIILJJIL;
        if (tuxSpinner != null) {
            C786410Ut5.LLZILL(tuxSpinner, 8);
        }
        if (interfaceC902100ZaC instanceof C902080ZaA) {
            C339190DRl.LIZIZ(LIZJ().LJJ);
            C786410Ut5.LJLLLLLL(0, LIZJ().LJIIZILJ);
            return;
        }
        if (interfaceC902100ZaC instanceof C902050Za7) {
            LIZ(((C902050Za7) interfaceC902100ZaC).LIZ, interfaceC902100ZaC);
            return;
        }
        if (interfaceC902100ZaC instanceof C901960ZZy) {
            SmartImageView smartImageView = LIZJ().LIZJ;
            if (smartImageView != null) {
                smartImageView.setActualImageResource(0);
                InterfaceC902220ZaO.LIZ.getClass();
                smartImageView.setTag(C902210ZaN.LIZJ, null);
            }
            if (C896400ZEo.LJIIJ(this.LLJ)) {
                C786410Ut5.LJLLLLLL(0, LIZJ().LJIIZILJ);
            }
            C786410Ut5.LJLLLLLL(0, LIZJ().LJIILL);
            C901960ZZy c901960ZZy = (C901960ZZy) interfaceC902100ZaC;
            ((TextView) LIZJ().LJIJJ.getValue()).setText(c901960ZZy.LIZ);
            InterfaceC902130ZaF interfaceC902130ZaF = c901960ZZy.LIZIZ;
            if (interfaceC902130ZaF instanceof C902020Za4) {
                RemoteImageView remoteImageViewLIZIZ = LIZJ().LIZIZ();
                Drawable drawable = ((C902020Za4) interfaceC902130ZaF).LIZ;
                int i = LLJJI;
                C1383370m6R.LJIILJJIL(i, i, remoteImageViewLIZIZ);
                remoteImageViewLIZIZ.setImageDrawable(drawable);
                C786410Ut5.l(LIZJ().LIZIZ(), 0);
                return;
            }
            if (interfaceC902130ZaF instanceof C902030Za5) {
                C902030Za5 c902030Za5 = (C902030Za5) interfaceC902130ZaF;
                IconTypeComponent iconTypeComponent = c902030Za5.LIZ.iconType;
                int[] iArr = C901950ZZx.LIZIZ;
                if (iArr[iconTypeComponent.ordinal()] == 1) {
                    C786410Ut5.l(LIZJ().LIZIZ(), 8);
                    TuxSpinner tuxSpinner2 = LIZJ().LJIILJJIL;
                    if (tuxSpinner2 != null) {
                        C786410Ut5.LLZILL(tuxSpinner2, 0);
                    }
                } else {
                    C786410Ut5.l(LIZJ().LIZIZ(), 0);
                }
                switch (iArr[c902030Za5.LIZ.iconType.ordinal()]) {
                    case 1:
                        TuxSpinner tuxSpinner3 = LIZJ().LJIILJJIL;
                        if (tuxSpinner3 == null) {
                            return;
                        }
                        C786410Ut5.LLZILL(tuxSpinner3, 0);
                        return;
                    case 2:
                        ImageComponent imageComponent = c902030Za5.LIZ;
                        ResolutionComponent resolutionComponent = imageComponent.resolution;
                        if (resolutionComponent != null) {
                            C1383370m6R.LJIILJJIL(resolutionComponent.width, resolutionComponent.height, LIZJ().LIZIZ());
                        }
                        C0I98.LJFF(LIZJ().LIZIZ(), C0I3J.LIZ(C2244081CsQ.LIZ(imageComponent)), this.LLILLJJLI.getScene(), null, null, 0, 0, true, null, C454440Hru.LIZ());
                        return;
                    case 3:
                    case 4:
                        RemoteImageView remoteImageViewLIZIZ2 = LIZJ().LIZIZ();
                        TuxIconDrawable tuxIconDrawableLIZ = C901930ZZv.LIZ.LIZ(LIZJ().LIZ());
                        int i2 = LLJJI;
                        C1383370m6R.LJIILJJIL(i2, i2, remoteImageViewLIZIZ2);
                        remoteImageViewLIZIZ2.setImageDrawable(tuxIconDrawableLIZ);
                        return;
                    case 5:
                    case 6:
                        RemoteImageView remoteImageViewLIZIZ3 = LIZJ().LIZIZ();
                        TuxIconDrawable tuxIconDrawableLIZ2 = this.LLILLJJLI.LIZ().LIZ(LIZJ().LIZ());
                        int i3 = LLJJI;
                        C1383370m6R.LJIILJJIL(i3, i3, remoteImageViewLIZIZ3);
                        remoteImageViewLIZIZ3.setImageDrawable(tuxIconDrawableLIZ2);
                        return;
                    default:
                        throw new C1954807lC();
                }
            }
            throw new C1954807lC();
        }
        if (Intrinsics.LJFF(interfaceC902100ZaC, C902140ZaG.LIZ)) {
            SmartImageView smartImageView2 = LIZJ().LIZJ;
            if (smartImageView2 != null) {
                smartImageView2.setActualImageResource(0);
                InterfaceC902220ZaO.LIZ.getClass();
                smartImageView2.setTag(C902210ZaN.LIZJ, null);
            }
            TuxSpinner tuxSpinner4 = LIZJ().LJIILJJIL;
            if (tuxSpinner4 != null) {
                C786410Ut5.LLZILL(tuxSpinner4, 0);
            }
            if (!C896400ZEo.LJIIJ(this.LLJ)) {
                return;
            }
            C786410Ut5.LJLLLLLL(0, LIZJ().LJIIZILJ);
            return;
        }
        if (interfaceC902100ZaC instanceof C902040Za6) {
            LIZ(((C902040Za6) interfaceC902100ZaC).LIZ, interfaceC902100ZaC);
            return;
        }
        throw new C1954807lC();
    }

    public final void LJIIL(boolean z) {
        int i;
        int i2;
        Drawable background;
        int i3 = 0;
        if (!z) {
            C786410Ut5.LJLLLLLL(8, LIZJ().LIZLLL);
            C786410Ut5.LJLLLLLL(8, LIZJ().LJII);
            C902070Za9 c902070Za9 = LIZJ().LIZIZ;
            int visibility = c902070Za9.getVisibility();
            c902070Za9.setVisibility(0);
            C1602160rnK.LIZIZ(visibility, 0, c902070Za9);
            LIZJ().LIZIZ.setStyle(EnumC901980Za0.DEFAULT);
            return;
        }
        if (((Boolean) C902250ZaR.LIZJ.getValue()).booleanValue()) {
            if (C1693106k5.LIZJ()) {
                this.LLJILJIL = true;
                View viewFindViewById = this.LLILLL.findViewById(R.id.evm);
                if (viewFindViewById != null && (background = viewFindViewById.getBackground()) != null) {
                    background.setAlpha(0);
                }
                C786410Ut5.LJLLLLLL(8, LIZJ().LIZLLL);
                C902070Za9 c902070Za92 = LIZJ().LIZIZ;
                int visibility2 = c902070Za92.getVisibility();
                c902070Za92.setVisibility(8);
                C1602160rnK.LIZIZ(visibility2, 8, c902070Za92);
                C786410Ut5.LJLLLLLL(0, LIZJ().LJII);
                C786410Ut5.LLLLLLZZ(LIZJ().LJIIIIZZ, 0);
                boolean zLIZ = C0H4W.LIZ();
                View view = LIZJ().LJII;
                float fLIZIZ = C418440Gaw.LIZIZ(Double.valueOf(0.5d));
                float fLIZIZ2 = C418440Gaw.LIZIZ(4);
                float fLIZIZ3 = C418440Gaw.LIZIZ(2);
                float fLIZIZ4 = C418440Gaw.LIZIZ(20);
                float fLIZIZ5 = C418440Gaw.LIZIZ(20);
                if (zLIZ) {
                    i = 20;
                } else {
                    i = 5;
                }
                float fLIZIZ6 = C418440Gaw.LIZIZ(i);
                if (zLIZ) {
                    i2 = 5;
                } else {
                    i2 = 20;
                }
                view.setBackground(new C2255561DQc(fLIZIZ, fLIZIZ2, fLIZIZ3, i3, fLIZIZ4, fLIZIZ5, fLIZIZ6, C418440Gaw.LIZIZ(i2), 24));
                String string = this.LLILLL.getContext().getString(2131846705);
                String string2 = this.LLILLL.getContext().getString(2131846698, string);
                LIZJ().LJIIIZ.setMovementMethod(new LinkMovementMethod() { // from class: X.0Gvd
                    @Override // android.text.method.LinkMovementMethod, android.text.method.ScrollingMovementMethod, android.text.method.BaseMovementMethod, android.text.method.MovementMethod
                    public final boolean onTouchEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
                        Integer numValueOf;
                        if (textView != null && motionEvent != null && (numValueOf = Integer.valueOf(motionEvent.getAction())) != null && (numValueOf.intValue() == 1 || numValueOf.intValue() == 0)) {
                            int x = ((int) motionEvent.getX()) - textView.getTotalPaddingTop();
                            int lineForVertical = textView.getLayout().getLineForVertical(((int) motionEvent.getY()) + textView.getScrollY());
                            float lineLeft = textView.getLayout().getLineLeft(lineForVertical);
                            float lineRight = textView.getLayout().getLineRight(lineForVertical);
                            float f = x;
                            if (f > lineRight || (x >= 0 && f < lineLeft)) {
                                return true;
                            }
                        }
                        return super.onTouchEvent(textView, spannable, motionEvent);
                    }
                });
                LIZJ().LJIIIZ.setHighlightColor(0);
                LIZJ().LJIIIZ.setText(C0TMP.LIZ(62, string2, string, new AwS593S0100000_14(this, 109)));
            } else {
                C786410Ut5.LJLLLLLL(0, LIZJ().LIZLLL);
                C902070Za9 c902070Za93 = LIZJ().LIZIZ;
                int visibility3 = c902070Za93.getVisibility();
                c902070Za93.setVisibility(8);
                C1602160rnK.LIZIZ(visibility3, 8, c902070Za93);
                C786410Ut5.LJLLLLLL(8, LIZJ().LJII);
                C786410Ut5.LLLLLLZZ(LIZJ().LJ, 0);
                LIZJ().LJFF.setText(LIZJ().LIZ().getString(2131831705));
            }
        }
        if (((Boolean) C902250ZaR.LIZLLL.getValue()).booleanValue()) {
            C786410Ut5.LJLLLLLL(0, LIZJ().LIZLLL);
            C902070Za9 c902070Za94 = LIZJ().LIZIZ;
            int visibility4 = c902070Za94.getVisibility();
            c902070Za94.setVisibility(0);
            C1602160rnK.LIZIZ(visibility4, 0, c902070Za94);
            C786410Ut5.LLLLLLZZ(LIZJ().LJ, 8);
            LIZJ().LIZIZ.setStyle(EnumC901980Za0.NUDE_MASK);
            LIZJ().LJFF.setText(LIZJ().LIZ().getString(2131831721));
        }
    }

    @Override // X.C09KS
    public final void onProgress(int i) {
        C902080ZaA c902080ZaA;
        if (i >= 0) {
            C869590Y9l c869590Y9l = this.LLJ;
            int i2 = 0;
            if (c869590Y9l != null && C0ZDX.LJJJJ(c869590Y9l)) {
                InterfaceC902100ZaC interfaceC902100ZaC = this.LLJJ;
                if ((interfaceC902100ZaC instanceof C902080ZaA) && (c902080ZaA = (C902080ZaA) interfaceC902100ZaC) != null) {
                    i2 = c902080ZaA.LIZ;
                }
                LJIIJ(new C902080ZaA(Math.min(99, Math.max(i2, C814420VxA.LIZIZ(i * 0.99f)))));
            }
        }
    }

    @Override // X.C09KS
    public final void rf(C1898507c7 c1898507c7) {
        LJFF(c1898507c7.LIZ);
    }

    public final void LIZ(C0ZSW c0zsw, InterfaceC902100ZaC interfaceC902100ZaC) {
        String string;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        TextComponent textComponent;
        LJII();
        int i = C901950ZZx.LIZ[c0zsw.ordinal()];
        int i2 = 8;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i == 5) {
                            if (interfaceC902100ZaC instanceof C902050Za7) {
                                C786410Ut5.LJLLLLLL(0, LIZJ().LJIILIIL);
                                if (C896400ZEo.LJIIJ(this.LLJ)) {
                                    C786410Ut5.LJLLLLLL(0, LIZJ().LJIIZILJ);
                                }
                            }
                            View view = LIZJ().LJIIJ;
                            if (view != null) {
                                C786410Ut5.LJLLLLLL(0, view);
                            }
                        } else {
                            throw new C1954807lC();
                        }
                    } else {
                        LIZJ().LIZJ(R.layout.cmm);
                        View view2 = LIZJ().LJJ;
                        if (view2 != null) {
                            C339190DRl.LIZLLL(view2);
                        }
                        TuxTextView tuxTextView = LIZJ().LJJI;
                        if (tuxTextView != null) {
                            tuxTextView.setText(C912070ZqH.LIZIZ.LJIL(LIZJ().LIZ(), 2131831773, new String[0]));
                        }
                        C197039127h c197039127h = LIZJ().LJJIFFI;
                        if (c197039127h != null) {
                            C786410Ut5.U8(c197039127h, new ACListenerS149S0100000_14(this, 36));
                        }
                        C197039127h c197039127h2 = LIZJ().LJJIFFI;
                        if (c197039127h2 != null) {
                            C786410Ut5.LLLLLLJ(c197039127h2, 0);
                        }
                        TuxTextView tuxTextView2 = LIZJ().LJJI;
                        if (tuxTextView2 != null) {
                            HandlerHook.viewPost(tuxTextView2, new ARunnableS106S0100000_6((Object) tuxTextView2, 72));
                        }
                    }
                } else {
                    LIZJ().LIZJ(R.layout.cml);
                    View view3 = LIZJ().LJJ;
                    if (view3 != null) {
                        C339190DRl.LIZLLL(view3);
                    }
                    TuxTextView tuxTextView3 = LIZJ().LJJI;
                    if (tuxTextView3 != null) {
                        tuxTextView3.setText(C912070ZqH.LIZIZ.LJIL(LIZJ().LIZ(), 2131831774, new String[0]));
                    }
                }
            } else {
                C786410Ut5.LLLLLLZZ(LIZJ().LJI, 0);
                View view4 = LIZJ().LJIIJ;
                if (view4 != null) {
                    C786410Ut5.LJLLLLLL(8, view4);
                }
                C786410Ut5.LJLLLLLL(8, LIZJ().LJIILIIL);
                C786410Ut5.LJLLLLLL(0, LIZJ().LJIIZILJ);
            }
        } else {
            C786410Ut5.LLLLZLL(LIZJ().LJIILLIIL, 0);
            C786410Ut5.LJLLLLLL(0, LIZJ().LJIIZILJ);
            TuxTextView tuxTextView4 = LIZJ().LJIILLIIL;
            C2242281CpW c2242281CpW = this.LLJIJIL;
            if (c2242281CpW == null || (textComponent = c2242281CpW.LIZIZ) == null || (string = textComponent.text) == null || string.length() == 0) {
                string = LIZJ().LIZ().getString(2131831598);
            }
            tuxTextView4.setText(string);
            float resolutionRatio$im_camera_card_release = LIZJ().LIZIZ.getResolutionRatio$im_camera_card_release();
            ViewGroup.LayoutParams layoutParams = LIZJ().LJIILLIIL.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            } else {
                marginLayoutParams = null;
            }
            if (C896400ZEo.LJI(this.LLJ)) {
                if (marginLayoutParams != null) {
                    marginLayoutParams.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0));
                    marginLayoutParams.bottomMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
                    C786410Ut5.R6(LIZJ().LJIILLIIL, marginLayoutParams);
                }
            } else if (resolutionRatio$im_camera_card_release > 1.2f) {
                if (marginLayoutParams != null) {
                    marginLayoutParams.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0));
                    marginLayoutParams.bottomMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
                    C786410Ut5.R6(LIZJ().LJIILLIIL, marginLayoutParams);
                }
            } else if (marginLayoutParams != null) {
                marginLayoutParams.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
                marginLayoutParams.bottomMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0));
                C786410Ut5.R6(LIZJ().LJIILLIIL, marginLayoutParams);
            }
            View view5 = LIZJ().LJIIJ;
            if (view5 != null) {
                if (resolutionRatio$im_camera_card_release < 1.2f) {
                    i2 = 0;
                }
                C786410Ut5.LJLLLLLL(i2, view5);
            }
            LIZJ().LJIJ.setButtonStartIcon(null);
            LIZJ().LJIJ.setText(LIZJ().LIZ.getContext().getString(2131831723));
            LIZJ().LJIJ.setTextColorRes(R.attr.zi);
            LIZJ().LJIJ.LJJJJL(new AwS593S0100000_14(this, 108));
            C786410Ut5.U8(LIZJ().LJIJ, new ACListenerS149S0100000_14(this, 35));
            C786410Ut5.LLLLLLJ(LIZJ().LJIJ, 0);
        }
        this.LLJILLL.setValue(c0zsw);
    }

    public final boolean LJI(View.OnClickListener onClickListener, View view) {
        boolean z;
        String conversationId;
        C902040Za6 c902040Za6;
        C869590Y9l c869590Y9l = this.LLJ;
        if (c869590Y9l != null && C896060ZDg.LIZLLL(c869590Y9l) && C902250ZaR.LIZ()) {
            if (!C1693106k5.LIZJ() && this.LLJ != null) {
                LJIIJJI(onClickListener, view);
            }
            return true;
        }
        InterfaceC902100ZaC interfaceC902100ZaC = this.LLJJ;
        C0ZSW c0zsw = null;
        if ((interfaceC902100ZaC instanceof C902040Za6) && (c902040Za6 = (C902040Za6) interfaceC902100ZaC) != null) {
            c0zsw = c902040Za6.LIZ;
        }
        if (c0zsw == C0ZSW.PHOTO_SWAP_REPLY_MASK) {
            z = true;
        } else {
            z = false;
        }
        C869590Y9l c869590Y9l2 = this.LLJ;
        if (c869590Y9l2 == null || !C896060ZDg.LIZIZ(c869590Y9l2) || !z) {
            C0Z40 c0z40 = IMSaasHostOfflineDebugService.LIZ;
            EnumC900880ZVu enumC900880ZVu = EnumC900880ZVu.PHOTO_SWAP_HIGH_RISK;
            c0z40.getClass();
            if (!C0Z40.LIZ(enumC900880ZVu)) {
                InterfaceC902100ZaC interfaceC902100ZaC2 = this.LLJJ;
                if (interfaceC902100ZaC2 instanceof C901960ZZy) {
                    ((C901960ZZy) interfaceC902100ZaC2).LIZJ.invoke();
                } else {
                    if (interfaceC902100ZaC2 instanceof C902040Za6) {
                        return false;
                    }
                    if (!Intrinsics.LJFF(interfaceC902100ZaC2, C902140ZaG.LIZ)) {
                        if (interfaceC902100ZaC2 instanceof C902050Za7) {
                            return false;
                        }
                        if (!(interfaceC902100ZaC2 instanceof C902080ZaA)) {
                            throw new C1954807lC();
                        }
                    }
                }
                return true;
            }
        }
        if (this.LLJ != null) {
            C1397580mTM c1397580mTM = new C1397580mTM(view.getContext());
            c1397580mTM.LJFF(2131831770);
            c1397580mTM.LIZ(2131831776);
            C985403tE.LIZ(c1397580mTM, new AwS223S0300000_14(onClickListener, view, this, 14));
            c1397580mTM.LIZLLL(new AwS593S0100000_14(this, 252));
            new C1397510mTF(c1397580mTM).LIZLLL();
            SessionInfo sessionInfo = this.LL;
            if (sessionInfo == null || (conversationId = sessionInfo.getConversationId()) == null) {
                conversationId = "";
            }
            C900960ZWc.LIZIZ(conversationId);
        }
        return true;
    }

    public final void LJIIJJI(View.OnClickListener onClickListener, View view) {
        String string;
        CharSequence string2;
        int chatType;
        if (C1693106k5.LIZJ()) {
            string = view.getContext().getString(2131846702);
            String string3 = view.getContext().getString(2131846703);
            string2 = C0TMP.LIZ(42, view.getContext().getString(2131846699, string3), string3, new AwS593S0100000_14(this, 254));
        } else {
            string = view.getContext().getString(2131831722);
            string2 = view.getContext().getString(2131831721);
        }
        C1397580mTM c1397580mTM = new C1397580mTM(view.getContext());
        c1397580mTM.LJI(string);
        c1397580mTM.LIZIZ(string2);
        C985403tE.LIZ(c1397580mTM, new AwS223S0300000_14(onClickListener, view, this, 16));
        new C1397510mTF(c1397580mTM).LIZLLL();
        InterfaceC1692306jx interfaceC1692306jxLIZJ = C912070ZqH.LIZIZ.LJIJJ().LIZJ();
        String strLIZIZ = LIZIZ();
        SessionInfo sessionInfo = this.LL;
        if (sessionInfo != null) {
            chatType = sessionInfo.getChatType();
        } else {
            chatType = -1;
        }
        interfaceC1692306jxLIZJ.LJ(null, strLIZIZ, C1677606ha.LIZ(chatType));
    }

    public final void LJIIIZ(C869590Y9l c869590Y9l, BaseTemplate baseTemplate, String str, C0ZSW c0zsw) {
        Fragment fragmentLIZIZ;
        C19EG activity;
        String strLIZIZ;
        boolean zLJI;
        String strLIZJ;
        String strLIZIZ2;
        AssemVMLazy assemVMLazy;
        String strLIZIZ3;
        Fragment fragmentLIZ;
        LJIIJ(new C902040Za6(c0zsw));
        LJIILIIL();
        if (c0zsw == C0ZSW.NO_MASK) {
            if (!C0ZWZ.LIZ(c869590Y9l, this.LL.getChatType())) {
                C0Z40 c0z40 = IMSaasHostOfflineDebugService.LIZ;
                EnumC900880ZVu enumC900880ZVu = EnumC900880ZVu.GROUP_SHOT_BTN;
                c0z40.getClass();
                if (!C0Z40.LIZ(enumC900880ZVu)) {
                    C0IBW c0ibw = C0IBW.LIZ;
                    Fragment fragmentLIZIZ2 = C897460ZIq.LIZIZ(LIZJ().LIZ);
                    SessionInfo sessionInfo = this.LL;
                    c0ibw.getClass();
                    IMAIRemixBridgeApi.LIZ.getClass();
                    IMAIRemixBridgeApi iMAIRemixBridgeApiLIZ = C0H0Z.LIZ();
                    if (iMAIRemixBridgeApiLIZ != null) {
                        zLJI = iMAIRemixBridgeApiLIZ.LJI();
                    } else {
                        zLJI = false;
                    }
                    if (zLJI && fragmentLIZIZ2 != null && sessionInfo != null && baseTemplate != null && (strLIZIZ2 = C902260ZaS.LIZIZ(baseTemplate)) != null && strLIZIZ2.length() != 0 && !C0ZDX.LJJJJIZL(c869590Y9l) && !sessionInfo.isMessageRequest() && !sessionInfo.isHighRiskConversation()) {
                        InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
                        C19719912Dl c19719912DlLIZ = C13LE.LIZ(ChatRoomCameraVM.class);
                        C5182020e c5182020e = new C5182020e((C13IQ) c19719912DlLIZ, 614);
                        AFwS248S0000000_14 aFwS248S0000000_14 = AFwS248S0000000_14.get$arr$(539);
                        if (Intrinsics.LJFF(interfaceC724760Sbq, C01D1.LIZ)) {
                            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(fragmentLIZIZ2, c19719912DlLIZ), c5182020e, new C452070Ho5(), new C1622206Wu(fragmentLIZIZ2, true), new C338490DOt(fragmentLIZIZ2, true), new AwS558S0100000_14((HasDefaultViewModelProviderFactory) fragmentLIZIZ2, 1658), aFwS248S0000000_14, new C451460Hn6(fragmentLIZIZ2, true), new C451620HnM(fragmentLIZIZ2, true), new C987103tV(fragmentLIZIZ2, true));
                        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
                            assemVMLazy = C451650HnP.LIZ(fragmentLIZIZ2, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(fragmentLIZIZ2, c19719912DlLIZ), c5182020e, new AwS558S0100000_14(fragmentLIZIZ2, 1654), aFwS248S0000000_14, null, null, null);
                        } else if (Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(fragmentLIZIZ2, c19719912DlLIZ), c5182020e, new C452070Ho5(), C724750Sbp.LJII(fragmentLIZIZ2), C724750Sbp.LJIIIZ(fragmentLIZIZ2), new AwS558S0100000_14((HasDefaultViewModelProviderFactory) fragmentLIZIZ2, 1655), aFwS248S0000000_14, new C451460Hn6(fragmentLIZIZ2, false), new C451620HnM(fragmentLIZIZ2, false), new C987103tV(fragmentLIZIZ2, false));
                        } else {
                            throw new IllegalArgumentException("Do not support this scope here.");
                        }
                        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C0IBW.LIZIZ;
                        int i = C0IBV.LIZ[((C457970Hxb) assemVMLazy.getValue().getState()).LL.ordinal()];
                        if (i != 1 && i != 2) {
                            if (i != 3 && i != 4) {
                                throw new C1954807lC();
                            }
                        } else {
                            if (baseTemplate == null || (strLIZIZ3 = C902260ZaS.LIZIZ(baseTemplate)) == null || strLIZIZ3.length() == 0 || (fragmentLIZ = C897460ZIq.LIZ(this.LLILLL)) == null) {
                                return;
                            }
                            C0IBW.LIZLLL(LIZJ().LJIJ, new C0H0X(this.LLILLL.getContext(), fragmentLIZ, strLIZIZ3, LIZIZ()));
                            return;
                        }
                    }
                    if (C0IBW.LIZ(c869590Y9l)) {
                        Fragment fragmentLIZ2 = C897460ZIq.LIZ(this.LLILLL);
                        SessionInfo sessionInfo2 = this.LL;
                        BaseTemplate baseTemplateLIZ = C0Z2Z.LIZ(c869590Y9l, BaseTemplate.class);
                        if (baseTemplateLIZ != null) {
                            strLIZJ = C0ZDX.LIZJ(baseTemplateLIZ);
                        } else {
                            strLIZJ = null;
                        }
                        if (fragmentLIZ2 != null && sessionInfo2 != null && strLIZJ != null) {
                            C0IBW.LIZLLL(LIZJ().LJIJ, new C459320Hzm(this.LLILLL.getContext(), fragmentLIZ2, sessionInfo2, strLIZJ));
                            return;
                        }
                        return;
                    }
                    if (!C0IBW.LIZIZ(C897460ZIq.LIZIZ(LIZJ().LIZ), c869590Y9l, this.LL, str, true) && !C0Z40.LIZ(EnumC900880ZVu.SHOW_TRY_EFFECT)) {
                        return;
                    }
                    Fragment fragmentLIZ3 = C897460ZIq.LIZ(this.LLILLL);
                    SessionInfo sessionInfo3 = this.LL;
                    if (fragmentLIZ3 == null || sessionInfo3 == null || str == null) {
                        return;
                    }
                    C0IBW.LIZLLL(LIZJ().LJIJ, new C459280Hzi(this.LLILLL.getContext(), fragmentLIZ3, C900770ZVj.LIZ(fragmentLIZ3), c869590Y9l, sessionInfo3, str));
                    return;
                }
            }
            SessionInfo sessionInfo4 = this.LL;
            if (sessionInfo4 != null && (fragmentLIZIZ = C897460ZIq.LIZIZ(LIZJ().LIZ)) != null && (activity = fragmentLIZIZ.getActivity()) != null) {
                InterfaceC911930Zq3 interfaceC911930Zq3LJIIZILJ = C912070ZqH.LIZIZ.LJIIZILJ();
                BaseTemplate baseTemplateLIZ2 = C0Z2Z.LIZ(c869590Y9l, BaseTemplate.class);
                if (baseTemplateLIZ2 != null) {
                    strLIZIZ = C0ZTJ.LIZIZ(baseTemplateLIZ2);
                } else {
                    strLIZIZ = null;
                }
                C0IBX c0ibxLIZJ = interfaceC911930Zq3LJIIZILJ.LIZJ(activity, sessionInfo4, strLIZIZ);
                if (c0ibxLIZJ == null) {
                    return;
                }
                C0IBW c0ibw2 = C0IBW.LIZ;
                C197039127h c197039127h = LIZJ().LJIJ;
                c0ibw2.getClass();
                C0IBW.LIZLLL(c197039127h, c0ibxLIZJ);
            }
        }
    }

    public final void LIZLLL(C869590Y9l c869590Y9l, BaseTemplate baseTemplate, UrlModel urlModel, C0ZSW c0zsw, String str, Function1<? super InterfaceC902450Zal, Unit> function1) {
        EnumC454500Hs0 enumC454500Hs0;
        Uri uri;
        String strLIZ;
        String str2;
        this.LLJILJILJ.setValue(EnumC901970ZZz.LLILLJJLI);
        SmartImageView smartImageView = LIZJ().LIZJ;
        if (smartImageView == null) {
            return;
        }
        String string = new C1180104jX(c869590Y9l.getUuid(), c0zsw.ordinal(), this.LLILZLL.invoke()).toString();
        InterfaceC902220ZaO.LIZ.getClass();
        Object tag = smartImageView.getTag(C902210ZaN.LIZJ);
        if (!(tag instanceof String)) {
            tag = null;
        }
        if (!C0ZDX.LJJJJ(c869590Y9l) && !Intrinsics.LJFF(tag, string)) {
            LJIIJ(C902140ZaG.LIZ);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("start load image, key: ");
        sbLIZ.append(string);
        sbLIZ.append(", url: ");
        sbLIZ.append(urlModel.getUrlList());
        C0YS1.LIZJ("MediaThumbnailController", C2188811AlT.LIZIZ(sbLIZ));
        C0Z40 c0z40 = IMSaasHostOfflineDebugService.LIZ;
        EnumC900880ZVu enumC900880ZVu = EnumC900880ZVu.FORCE_IMAGE_LOAD_FAIL;
        c0z40.getClass();
        if (C0Z40.LIZ(enumC900880ZVu)) {
            urlModel.setUrlList(Collections.singletonList("dongwoo"));
        }
        C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(urlModel));
        c1331670kl3LJIIIIZZ.LJJ(smartImageView);
        if (Intrinsics.LJFF(this.LLILLJJLI, C902000Za2.LIZ)) {
            enumC454500Hs0 = EnumC454500Hs0.PRIVATE_PHOTO;
        } else {
            enumC454500Hs0 = EnumC454500Hs0.PRIVATE_VIDEO;
        }
        c1331670kl3LJIIIIZZ.LIZLLL(enumC454500Hs0.getCallerId());
        c1331670kl3LJIIIIZZ.LJJJJLI = false;
        int i = C901950ZZx.LIZ[c0zsw.ordinal()];
        if (i != 1) {
            if (i == 2 || i == 3 || i == 4) {
                c1331670kl3LJIIIIZZ.LJJIJIL(C912070ZqH.LIZIZ.getUiService().LJII(16));
            }
        } else {
            c1331670kl3LJIIIIZZ.LJJIFFI = new C1332060klg(25, 3, 0);
        }
        C1332130kln.LIZJ(c1331670kl3LJIIIIZZ, C06TB.DEFAULT);
        Context context = smartImageView.getContext();
        String str3 = (String) C13LP.LJJJLL(urlModel.getUrlList());
        if (str3 != null) {
            uri = UriProtector.parse(str3);
        } else {
            uri = null;
        }
        C1332130kln.LIZ(c1331670kl3LJIIIIZZ, context, uri);
        String scene = this.LLILLJJLI.getScene();
        C0I6E c0i6e = new C0I6E(string);
        C444040Hb8 c444040Hb8 = new C444040Hb8(new C901940ZZw(function1, this, c869590Y9l, baseTemplate, str, c0zsw), new C901910ZZt(function1, this, c0zsw, c869590Y9l, baseTemplate, urlModel, str));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        IIMAnalyticsUtil iIMAnalyticsUtil = (IIMAnalyticsUtil) PluggableExtentionKt.pluggableSpi$default(IIMAnalyticsUtil.class, false, false, false, 14, null);
        if (iIMAnalyticsUtil == null || (strLIZ = iIMAnalyticsUtil.LIZ(this.LL.getConversationId())) == null) {
            strLIZ = "";
        }
        linkedHashMap.put("chat_type", strLIZ);
        if (this.LLILZLL.invoke().booleanValue()) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("is_first_screen", str2);
        linkedHashMap.put("view_height", String.valueOf(LIZJ().LIZIZ.getMeasuredHeight()));
        linkedHashMap.put("view_width", String.valueOf(LIZJ().LIZIZ.getMeasuredWidth()));
        C1332130kln.LJFF(c1331670kl3LJIIIIZZ, scene, c444040Hb8, false, c0i6e, c869590Y9l, linkedHashMap, 4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C901890ZZr(SessionInfo sessionInfo, InterfaceC902110ZaD interfaceC902110ZaD, View view, Function1<? super C869590Y9l, Unit> function1, Function2<? super View, ? super Boolean, Unit> function2, Function0<Boolean> function0, Function0<Unit> function02) {
        this.LL = sessionInfo;
        this.LLILLJJLI = interfaceC902110ZaD;
        this.LLILLL = view;
        this.LLILZ = function1;
        this.LLILZIL = function2;
        this.LLILZLL = function0;
        this.LLIZ = function02;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJ(C869590Y9l c869590Y9l, BaseTemplate baseTemplate, C2242281CpW c2242281CpW, List<String> list, boolean z, boolean z2, SessionInfo sessionInfo, String str, Function1<? super InterfaceC902450Zal, Unit> function1) {
        String uuid;
        int i;
        C901960ZZy c901960ZZy;
        int i2;
        boolean z3;
        String str2;
        Drawable background;
        C2242281CpW c2242281CpW2 = c2242281CpW;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("msg: ");
        sbLIZ.append(c869590Y9l.getMsgId());
        sbLIZ.append("; type: ");
        sbLIZ.append(c869590Y9l.getMsgType());
        sbLIZ.append("; isMediaMsgMasking: ");
        sbLIZ.append(z2);
        sbLIZ.append(';');
        C2188811AlT.LIZIZ(sbLIZ);
        this.LLJILJILJ.setValue(EnumC901970ZZz.LL);
        C869590Y9l c869590Y9l2 = this.LLJ;
        ActionLinkComponent actionLinkComponent = null;
        Object[] objArr = 0;
        if (c869590Y9l2 != null) {
            uuid = c869590Y9l2.getUuid();
        } else {
            uuid = null;
        }
        boolean z4 = !Intrinsics.LJFF(uuid, c869590Y9l.getUuid());
        this.LLJ = c869590Y9l;
        this.LL = sessionInfo;
        this.LLJIJIL = c2242281CpW2;
        this.LLJILJIL = false;
        View viewFindViewById = this.LLILLL.findViewById(R.id.evm);
        C902070Za9 c902070Za9 = LIZJ().LIZIZ;
        InterfaceC902110ZaD interfaceC902110ZaD = this.LLILLJJLI;
        C902010Za3 c902010Za3 = C902010Za3.LIZ;
        if (Intrinsics.LJFF(interfaceC902110ZaD, c902010Za3)) {
            i = 2131849611;
        } else {
            i = 2131835833;
        }
        c902070Za9.setContentDescription(C1383370m6R.LJIIJ(i));
        if (Intrinsics.LJFF(this.LLILLJJLI, c902010Za3)) {
            int i3 = C20094413jq.LJIIZILJ;
            C902070Za9 c902070Za92 = LIZJ().LIZIZ;
            C1397760mTe c1397760mTe = new C1397760mTe();
            c1397760mTe.LJFF = C1383370m6R.LJIIJ(2131823179);
            C20094813ju.LIZ(c902070Za92, c1397760mTe.LIZ());
        }
        if (viewFindViewById != null && (background = viewFindViewById.getBackground()) != null) {
            background.setAlpha(255);
        }
        LJII();
        C339190DRl.LIZIZ(LIZJ().LJII);
        C786410Ut5.LLLLLLJ(LIZJ().LJIJ, 8);
        C197039127h c197039127h = LIZJ().LJJIFFI;
        if (c197039127h != null) {
            C786410Ut5.LLLLLLJ(c197039127h, 8);
        }
        View view = LIZJ().LJIJI;
        if (view != null) {
            C786410Ut5.LJLLLLLL(8, view);
        }
        C426320Gne c426320Gne = LIZJ().LJIIJJI;
        if (c426320Gne != null) {
            C786410Ut5.LJLLLLLL(8, c426320Gne);
        }
        TuxTextView tuxTextView = LIZJ().LJIIL;
        if (tuxTextView != null) {
            C786410Ut5.LJLLLLLL(8, tuxTextView);
        }
        C896400ZEo.LJ(baseTemplate);
        C0ZSW c0zswLJ = C896060ZDg.LJ(c869590Y9l, z2);
        if (z4) {
            C893560Z3q c893560Z3q = C893560Z3q.LIZ;
            Long lValueOf = Long.valueOf(c869590Y9l.getSender());
            String conversationId = c869590Y9l.getConversationId();
            String str3 = "private_video";
            if (!(this.LLILLJJLI instanceof C902010Za3)) {
                str3 = "private_image";
            }
            boolean zLJI = C896400ZEo.LJI(c869590Y9l);
            boolean zLJIIIZ = C896400ZEo.LJIIIZ(c869590Y9l);
            if (c0zswLJ != C0ZSW.NUDE_MASK && c0zswLJ != C0ZSW.SAFETY_MASK) {
                z3 = false;
            } else {
                z3 = true;
            }
            boolean zLIZ = C123100dR.LIZ(C0ZTJ.LIZIZ(baseTemplate));
            BaseTemplate baseTemplateLIZ = C0Z2Z.LIZ(c869590Y9l, BaseTemplate.class);
            if (baseTemplateLIZ != null && C0ZDX.LIZJ(baseTemplateLIZ) != null) {
                str2 = "dm_effect_game";
            } else {
                str2 = "";
            }
            C893560Z3q.LIZJ(c893560Z3q, lValueOf, null, conversationId, str3, str3, str, zLJI, zLJIIIZ, z3, zLIZ, null, str2, str, null, 52224);
        }
        if (!C901060ZWm.LIZJ(c869590Y9l)) {
            C0Z40 c0z40 = IMSaasHostOfflineDebugService.LIZ;
            EnumC900880ZVu enumC900880ZVu = EnumC900880ZVu.USER_REQUEST_MSG_REFRESH;
            c0z40.getClass();
            if (!C0Z40.LIZ(enumC900880ZVu)) {
                if (c2242281CpW2 == null) {
                    if (C0Z40.LIZ(EnumC900880ZVu.FALLBACK_INFO_LOADING)) {
                        c2242281CpW2 = new C2242281CpW(7, actionLinkComponent, (ImageComponent) (objArr == true ? 1 : 0));
                    } else {
                        if (!C0ZDX.LJJIIJ(c869590Y9l) && !C0Z40.LIZ(EnumC900880ZVu.DELETED_ON_SERVER)) {
                            if (C896060ZDg.LIZLLL(c869590Y9l)) {
                                LJIIL(true);
                                C891990Yyz.LIZLLL(c869590Y9l, sessionInfo, C896060ZDg.LIZ(c869590Y9l));
                                if (((Boolean) C902250ZaR.LIZJ.getValue()).booleanValue()) {
                                    return;
                                }
                            } else {
                                LJIIL(false);
                            }
                            if ((!((ArrayList) list).isEmpty() || C0ZDX.LJJJJ(c869590Y9l)) && !C0Z40.LIZ(EnumC900880ZVu.THUMBNAIL_EMPTY_AND_MESSAGE_NOT_SENDING)) {
                                if (!z4 && this.LLJILJILJ.getValue() == EnumC901970ZZz.LLILLL) {
                                    if (c869590Y9l.getMsgStatus() == 2 || c869590Y9l.getMsgStatus() == 5) {
                                        LJIIIZ(c869590Y9l, baseTemplate, str, c0zswLJ);
                                        return;
                                    }
                                    return;
                                }
                                if ((!r6.isEmpty()) && !C0Z40.LIZ(EnumC900880ZVu.THUMBNAIL_EMPTY_AND_MESSAGE_SENDING)) {
                                    LIZLLL(c869590Y9l, baseTemplate, C0I3J.LIZ(list), c0zswLJ, str, function1);
                                    return;
                                }
                                this.LLJILJILJ.setValue(EnumC901970ZZz.LLILZIL);
                                SmartImageView smartImageView = LIZJ().LIZJ;
                                if (smartImageView == null) {
                                    return;
                                }
                                smartImageView.setController(null);
                                return;
                            }
                            if ((!Intrinsics.LJFF(this.LLILLJJLI, c902010Za3) || !z) && !C0Z40.LIZ(EnumC900880ZVu.HAS_VIDEO_MODEL)) {
                                C419910GdJ c419910GdJ = C901930ZZv.LIZ;
                                LJIIJ(C901930ZZv.LIZ(this.LLILLJJLI, this.LLJ, LIZJ().LIZ(), "thumbnail_list_empty", new AwS415S0200000_14(this, c869590Y9l, 46)));
                                LJIILIIL();
                                return;
                            } else {
                                LJIIJ(new C902050Za7(c0zswLJ));
                                LJIILIIL();
                                function1.invoke(new C0ZYR("urlList is empty"));
                                return;
                            }
                        }
                        Context contextLIZ = LIZJ().LIZ();
                        if (Intrinsics.LJFF(this.LLILLJJLI, c902010Za3)) {
                            i2 = 2131831025;
                        } else {
                            i2 = 2131831015;
                        }
                        String string = contextLIZ.getString(i2);
                        ImageComponent.Companion.getClass();
                        LJIIJ(new C901960ZZy(string, new C902030Za5(ImageComponent.LIZ(C18ZU.LIZ(), null, IconTypeComponent.MODERATION, 31)), AFwS201S0000000_14.get$arr$(227)));
                        LJIILIIL();
                        function1.invoke(new C0ZYR("msg is expired"));
                        return;
                    }
                }
                String str4 = c2242281CpW2.LIZIZ.text;
                if (c2242281CpW2.LIZJ.linkType == ActionLinkType.REFRESH) {
                    C419910GdJ c419910GdJ2 = C901930ZZv.LIZ;
                    c901960ZZy = C901930ZZv.LIZ(this.LLILLJJLI, this.LLJ, LIZJ().LIZ(), "refresh_fallback_info", new AwS415S0200000_14(this, c869590Y9l, 46));
                } else {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("ErrorState, imageComponent=");
                    sbLIZ2.append(c2242281CpW2.LIZ);
                    C2188811AlT.LIZIZ(sbLIZ2);
                    c901960ZZy = new C901960ZZy(str4, new C902030Za5(c2242281CpW2.LIZ), AFwS201S0000000_14.get$arr$(427));
                }
                LJIIJ(c901960ZZy);
                LJIILIIL();
                function1.invoke(new C0ZYR("Fallback info from server or video_model is empty"));
                return;
            }
        }
        LJIIJ(C902140ZaG.LIZ);
        LJIILIIL();
    }
}
