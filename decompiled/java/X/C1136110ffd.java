package X;

import Y.ACListenerS120S0200000_17;
import Y.ARunnableS117S0100000_17;
import android.content.Context;
import android.text.TextPaint;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.gift.base.platform.core.manager.GiftManager;
import com.bytedance.android.livesdk.gift.model.GiftColorInfo;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.model.GiftTrayInfo;
import com.bytedance.android.livesdk.model.message.GiftMessage;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.OppoPermissionPopupMaskDelayExp;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS561S0100000_17;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ffd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1136110ffd extends AbstractC1132750faD implements InterfaceC1136880fgs {
    public C1126540fQC LJFF;
    public C16F5 LJI;
    public View LJII;
    public TextView LJIIIIZZ;
    public C16F5 LJIIIZ;
    public TextView LJIIJ;
    public final C01GW LJIIJJI;
    public final C1136120ffe LJIIL;

    @Override // X.InterfaceC1137250fhT
    public final void dispose() {
        this.LIZLLL = null;
        this.LJ = null;
        this.LJFF = null;
        this.LJI = null;
        this.LJII = null;
        this.LJIIIIZZ = null;
        this.LJIIIZ = null;
        this.LJIIJ = null;
    }

    @Override // X.InterfaceC1137250fhT
    public final void LJII() {
        C1126540fQC c1126540fQC = this.LJFF;
        if (c1126540fQC != null) {
            C786410Ut5.d8(c1126540fQC, null);
        }
        C16F5 c16f5 = this.LJI;
        if (c16f5 != null) {
            C786410Ut5.l8(c16f5, null);
        }
        TextView textView = this.LJIIIIZZ;
        if (textView != null) {
            C786410Ut5.T7(textView, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJIL() {
        /*
            r7 = this;
            X.0ff9 r1 = r7.LIZIZ
            r4 = 1
            r6 = 0
            if (r1 == 0) goto L68
            com.bytedance.android.livesdk.model.GiftTrayInfo r0 = r1.LJIJJLI
            if (r0 == 0) goto L68
            boolean r0 = r0.canMirror
            if (r0 != r4) goto L68
            r5 = 1
        Lf:
            r2 = 0
            if (r1 == 0) goto L1c
            com.bytedance.android.livesdk.model.message.GiftMonitorInfo r0 = r1.LJJJZ
            if (r0 == 0) goto L1c
            long r0 = r0.to_user_id
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
        L1c:
            X.0ff9 r1 = r7.LIZIZ
            if (r1 == 0) goto L30
            boolean r0 = r1.LJJJLIIL
            if (r0 != r4) goto L30
            com.bytedance.android.live.base.model.user.User r0 = r1.LJJL
            if (r0 == 0) goto L6a
            long r0 = r0.getId()
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
        L30:
            if (r2 == 0) goto L6a
            long r1 = r2.longValue()
            com.bytedance.android.live.liveinteract.InteractServiceDel r0 = com.bytedance.android.live.liveinteract.InteractServiceDel.LLILLJJLI
            android.graphics.Rect r0 = r0.mI2(r1)
            if (r0 == 0) goto L6a
            int r0 = r0.centerX()
            float r3 = (float) r0
            X.0fQC r0 = r7.LJFF
            if (r0 == 0) goto L6a
            int r0 = r0.getWidth()
            int r2 = r0 / 2
            X.0fQC r0 = r7.LJFF
            if (r0 == 0) goto L6a
            float r1 = r0.getX()
            float r0 = (float) r2
            float r1 = r1 + r0
            java.lang.Float r0 = java.lang.Float.valueOf(r1)
            if (r0 == 0) goto L6a
            if (r5 == 0) goto L6a
            float r0 = r0.floatValue()
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 <= 0) goto L6a
            return r4
        L68:
            r5 = 0
            goto Lf
        L6a:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1136110ffd.LJIL():boolean");
    }

    public final void LJJ() {
        C1135810ff9 c1135810ff9 = this.LIZIZ;
        if (c1135810ff9 == null || c1135810ff9.LJII != 3) {
            return;
        }
        HandlerHook.viewPost(this.LIZ, new ARunnableS117S0100000_17(this, 21));
    }

    @Override // X.InterfaceC1136880fgs
    public final View LIZ() {
        return this.LJII;
    }

    @Override // X.InterfaceC1137250fhT
    public final void LIZLLL() {
        LJJ();
    }

    @Override // X.InterfaceC1136880fgs
    public final C1126540fQC LJIIJ() {
        return this.LJFF;
    }

    @Override // X.InterfaceC1136880fgs
    public final C16F5 LJIILL() {
        return this.LJIIIZ;
    }

    @Override // X.InterfaceC1137250fhT
    public final InterfaceC1137400fhi LJIILLIIL() {
        return this.LJIIL;
    }

    @Override // X.InterfaceC1136880fgs
    public final TextView getComboCount() {
        return this.LJIIIIZZ;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.0ffe] */
    public C1136110ffd(FrameLayout frameLayout) {
        super(frameLayout);
        this.LJIIJJI = C292401Bi.LIZ(new AwS561S0100000_17(frameLayout, 41));
        this.LJIIL = new InterfaceC1137400fhi() { // from class: X.0ffe
            @Override // X.InterfaceC1137400fhi
            public final void LIZ() {
            }

            @Override // X.InterfaceC1137400fhi
            public final void LIZIZ() {
                C1136110ffd c1136110ffd = this.LIZ;
                if (C1132700fa8.LJ(c1136110ffd.LIZIZ, c1136110ffd.LIZLLL)) {
                    C500260Jjc.LJIILLIIL(this.LIZ.LJFF);
                    C500260Jjc.LJIILIIL(this.LIZ.LJIIIIZZ);
                    C500260Jjc.LJIILIIL(this.LIZ.LJIIIZ);
                    C1137540fhw c1137540fhw = EnumC1136790fgj.Companion;
                    EnumC1136790fgj enumC1136790fgj = this.LIZ.LIZJ;
                    c1137540fhw.getClass();
                    if (C1137540fhw.LIZ(enumC1136790fgj)) {
                        C500260Jjc.LLFFF(this.LIZ.LJFF);
                    }
                }
                InterfaceC1128210fSt interfaceC1128210fStInst = GiftManager.inst();
                C1135810ff9 c1135810ff9 = this.LIZ.LIZIZ;
                if (interfaceC1128210fStInst.getFreqLimitOption(c1135810ff9 != null ? Long.valueOf(c1135810ff9.LJJJJZ) : null) != null) {
                    C500260Jjc.LJIILIIL(this.LIZ.LJIIIZ);
                    C500260Jjc.LJIILIIL(this.LIZ.LJIIIIZZ);
                }
                C1136110ffd c1136110ffd2 = this.LIZ;
                if (c1136110ffd2.LJII != null) {
                    C1133690fbj c1133690fbj = C1133690fbj.LIZ;
                    C1135810ff9 c1135810ff92 = c1136110ffd2.LIZIZ;
                    c1133690fbj.getClass();
                    if (C1133690fbj.LJ(c1135810ff92)) {
                        C500260Jjc.LJIILIIL(this.LIZ.LJII);
                    } else {
                        C500260Jjc.LJIILLIIL(this.LIZ.LJII);
                    }
                }
            }

            @Override // X.InterfaceC1137400fhi
            public final void LIZLLL(boolean z) {
                View view;
                Long lValueOf;
                C1133690fbj c1133690fbj = C1133690fbj.LIZ;
                C1135810ff9 c1135810ff9 = this.LIZ.LIZIZ;
                c1133690fbj.getClass();
                if (!C1133690fbj.LJ(c1135810ff9) && (view = this.LIZ.LJII) != null) {
                    C500260Jjc.LLFFF(view);
                    InterfaceC1128210fSt interfaceC1128210fStInst = GiftManager.inst();
                    C1135810ff9 c1135810ff92 = this.LIZ.LIZIZ;
                    if (c1135810ff92 != null) {
                        lValueOf = Long.valueOf(c1135810ff92.LJJJJZ);
                    } else {
                        lValueOf = null;
                    }
                    if (interfaceC1128210fStInst.getFreqLimitOption(lValueOf) == null) {
                        C500260Jjc.LLFFF(this.LIZ.LJIIIZ);
                        C500260Jjc.LLFFF(this.LIZ.LJIIIIZZ);
                    } else {
                        C500260Jjc.LJIILIIL(this.LIZ.LJIIIZ);
                        C500260Jjc.LJIILIIL(this.LIZ.LJIIIIZZ);
                    }
                }
                if (z) {
                    C1137540fhw c1137540fhw = EnumC1136790fgj.Companion;
                    EnumC1136790fgj enumC1136790fgj = this.LIZ.LIZJ;
                    c1137540fhw.getClass();
                    if (C1137540fhw.LIZ(enumC1136790fgj)) {
                        C500260Jjc.LLFFF(this.LIZ.LJFF);
                    }
                }
            }

            @Override // X.InterfaceC1137400fhi
            public final void LIZJ(boolean z, C1136900fgu c1136900fgu) {
                TextView textViewLJIILJJIL;
                TextPaint paint;
                InterfaceC1138050fil interfaceC1138050filLJIJJLI;
                View viewLJFF;
                C1136110ffd c1136110ffd;
                C1135810ff9 c1135810ff9;
                if (c1136900fgu != null) {
                    if (c1136900fgu.LIZJ > 1 && (c1135810ff9 = (c1136110ffd = this.LIZ).LIZIZ) != null) {
                        c1136110ffd.LJJI(c1135810ff9, true);
                    }
                    C1136110ffd c1136110ffd2 = this.LIZ;
                    InterfaceC1136920fgw interfaceC1136920fgw = c1136110ffd2.LJ;
                    if (interfaceC1136920fgw != null) {
                        InterfaceC1137440fhm interfaceC1137440fhmLJIL = interfaceC1136920fgw.LJIL();
                        int measuredWidth = 0;
                        if (interfaceC1137440fhmLJIL != null && (textViewLJIILJJIL = interfaceC1137440fhmLJIL.LJIILJJIL()) != null && (paint = textViewLJIILJJIL.getPaint()) != null) {
                            float fMeasureText = paint.measureText(C497740JfY.LJIJJ(2131841050, Long.valueOf(c1136900fgu.LIZJ)));
                            if (fMeasureText != 0.0f) {
                                InterfaceC1136920fgw interfaceC1136920fgw2 = c1136110ffd2.LJ;
                                if (interfaceC1136920fgw2 != null && (interfaceC1138050filLJIJJLI = interfaceC1136920fgw2.LJIJJLI()) != null && (viewLJFF = interfaceC1138050filLJIJJLI.LJFF()) != null) {
                                    measuredWidth = viewLJFF.getMeasuredWidth();
                                }
                                float fLIZIZ = measuredWidth + ((int) C497740JfY.LIZIZ(24.0f)) + ((int) C497740JfY.LIZIZ(36.0f)) + fMeasureText;
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("gift tray width over screen giftTrayViewWidth = ");
                                sbLIZ.append(fLIZIZ);
                                C1138230fj3.LIZJ("LiveGiftTrayComboGiftSection", C2188811AlT.LIZIZ(sbLIZ));
                                if (fLIZIZ >= C497740JfY.LJIIZILJ()) {
                                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                    sbLIZ2.append("gift tray width over screen giftTrayViewWidth = ");
                                    sbLIZ2.append(fLIZIZ);
                                    C1138230fj3.LIZJ("LiveGiftTrayComboGiftSection", C2188811AlT.LIZIZ(sbLIZ2));
                                    C16F5 c16f5 = c1136110ffd2.LJI;
                                    if (c16f5 != null) {
                                        c16f5.setMaxWidth(((int) C497740JfY.LIZIZ(86.0f)) - ((int) (fLIZIZ - C497740JfY.LJIIZILJ())));
                                    }
                                }
                            }
                        }
                    }
                    C500260Jjc.LLFFF(this.LIZ.LJFF);
                }
            }

            @Override // X.InterfaceC1137400fhi
            public final void LJ(boolean z, boolean z2, boolean z3) {
                Long lValueOf;
                C1136110ffd c1136110ffd = this.LIZ;
                if (c1136110ffd.LJII == null) {
                    return;
                }
                if (!z) {
                    C1138230fj3.LIZJ("LiveGiftTrayComboGiftSection", "entryAnimationEnd no right tag");
                    this.LIZ.LJJ();
                    return;
                }
                C1137540fhw c1137540fhw = EnumC1136790fgj.Companion;
                EnumC1136790fgj enumC1136790fgj = c1136110ffd.LIZJ;
                c1137540fhw.getClass();
                if (C1137540fhw.LIZ(enumC1136790fgj)) {
                    C1138230fj3.LIZ("LiveGiftTrayComboGiftSection", "entryAnimationEnd shouldDisableRightTagAnimation");
                    C1136110ffd c1136110ffd2 = this.LIZ;
                    C500260Jjc.LLFFF(c1136110ffd2.LJIIIIZZ);
                    C500260Jjc.LLFFF(c1136110ffd2.LJIIIZ);
                    C500260Jjc.LLFFF(c1136110ffd2.LJFF);
                    InterfaceC1128210fSt interfaceC1128210fStInst = GiftManager.inst();
                    C1135810ff9 c1135810ff9 = c1136110ffd2.LIZIZ;
                    if (c1135810ff9 != null) {
                        lValueOf = Long.valueOf(c1135810ff9.LJJJJZ);
                    } else {
                        lValueOf = null;
                    }
                    if (interfaceC1128210fStInst.getFreqLimitOption(lValueOf) != null) {
                        C500260Jjc.LJIILIIL(c1136110ffd2.LJIIIZ);
                        C500260Jjc.LJIILIIL(c1136110ffd2.LJIIIIZZ);
                    }
                } else {
                    C1138230fj3.LIZ("LiveGiftTrayComboGiftSection", "entryAnimationEnd showRightTagInMediumTrayWithAnimation firstGift");
                    if (!z3 && z2) {
                        C500260Jjc.LLFFF(this.LIZ.LJFF);
                    }
                }
                this.LIZ.LJJ();
            }
        };
    }

    public static boolean LJIJJLI(C1135810ff9 c1135810ff9) {
        GiftTrayInfo giftTrayInfo;
        ImageModel imageModel;
        List<String> listLIZ;
        GiftMessage giftMessage = c1135810ff9.LIZ;
        if (giftMessage == null || (giftTrayInfo = giftMessage.mTrayInfo) == null || (imageModel = giftTrayInfo.mDynamicImg) == null || (listLIZ = C842240X2g.LIZ(imageModel)) == null || listLIZ.size() <= 0) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC1136880fgs
    public final ImageModel LIZIZ(C1135810ff9 c1135810ff9) {
        Gift gift;
        Gift gift2;
        List<GiftColorInfo> list;
        GiftColorInfo next;
        ImageModel imageModel;
        GiftTrayInfo giftTrayInfo;
        Gift gift3;
        ImageModel imageModel2 = null;
        if (c1135810ff9.LJIIIIZZ == EnumC743790TFp.TRAY_ONLY) {
            GiftMessage giftMessage = c1135810ff9.LIZ;
            if (giftMessage != null) {
                gift3 = giftMessage.mGift;
                if (gift3 != null) {
                    imageModel2 = gift3.image;
                }
            } else {
                gift3 = null;
            }
            return C1133610fbb.LIZJ(gift3, imageModel2);
        }
        if (LJIJJLI(c1135810ff9)) {
            GiftMessage giftMessage2 = c1135810ff9.LIZ;
            if (giftMessage2 == null || (giftTrayInfo = giftMessage2.mTrayInfo) == null) {
                return null;
            }
            return giftTrayInfo.mDynamicImg;
        }
        GiftMessage giftMessage3 = c1135810ff9.LIZ;
        if (giftMessage3 != null && (gift2 = giftMessage3.mGift) != null && (list = gift2.colorInfos) != null) {
            Iterator<GiftColorInfo> it2 = list.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    GiftColorInfo giftColorInfo = next;
                    if (Intrinsics.LJFF(giftColorInfo.colorId, c1135810ff9.LIZ.colorId) && giftColorInfo.giftImage != null) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            GiftColorInfo giftColorInfo2 = next;
            if (giftColorInfo2 != null && (imageModel = giftColorInfo2.giftImage) != null) {
                return imageModel;
            }
        }
        GiftMessage giftMessage4 = c1135810ff9.LIZ;
        if (giftMessage4 != null) {
            gift = giftMessage4.mGift;
            if (gift != null) {
                imageModel2 = gift.image;
            }
        } else {
            gift = null;
        }
        return C1133610fbb.LIZJ(gift, imageModel2);
    }

    @Override // X.InterfaceC1137250fhT
    public final void LIZJ(Context context) {
        C1126540fQC c1126540fQC = this.LJFF;
        if (c1126540fQC != null) {
            C786410Ut5.d8(c1126540fQC, new ACListenerS120S0200000_17(context, this, 0));
        }
        C16F5 c16f5 = this.LJI;
        if (c16f5 != null) {
            C786410Ut5.l8(c16f5, new ACListenerS120S0200000_17(context, this, 1));
        }
        TextView textView = this.LJIIIIZZ;
        if (textView != null) {
            C786410Ut5.T7(textView, new ACListenerS120S0200000_17(context, this, 2));
        }
    }

    @Override // X.InterfaceC1137250fhT
    public final void LJIIIIZZ(C1135810ff9 c1135810ff9) {
        Integer numValueOf;
        if (c1135810ff9 != null) {
            numValueOf = Integer.valueOf(c1135810ff9.LIZJ());
        } else {
            numValueOf = null;
        }
        LJJIFFI(String.valueOf(numValueOf));
    }

    @Override // X.InterfaceC1136880fgs
    public final void LJIIIZ(int[] iArr) {
        if (LJIL()) {
            C1126540fQC c1126540fQC = this.LJFF;
            if (c1126540fQC != null) {
                c1126540fQC.getLocationOnScreen(iArr);
            }
            C1126540fQC c1126540fQC2 = this.LJFF;
            if (c1126540fQC2 != null) {
                iArr[0] = iArr[0] - c1126540fQC2.getWidth();
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("mirror x");
            sbLIZ.append(iArr[0]);
            sbLIZ.append(" y");
            sbLIZ.append(iArr[1]);
            C1138230fj3.LIZJ("LiveGiftTrayComboGiftSection", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        C1126540fQC c1126540fQC3 = this.LJFF;
        if (c1126540fQC3 != null) {
            c1126540fQC3.getLocationOnScreen(iArr);
        }
        C1126540fQC c1126540fQC4 = this.LJFF;
        if (c1126540fQC4 != null) {
            iArr[0] = iArr[0] + c1126540fQC4.getWidth();
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("no mirror x");
        sbLIZ2.append(iArr[0]);
        sbLIZ2.append(" y");
        sbLIZ2.append(iArr[1]);
        C1138230fj3.LIZJ("LiveGiftTrayComboGiftSection", C2188811AlT.LIZIZ(sbLIZ2));
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0131  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIFFI(java.lang.String r12) {
        /*
            Method dump skipped, instruction units count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1136110ffd.LJJIFFI(java.lang.String):void");
    }

    @Override // X.InterfaceC1137250fhT
    public final void LJIIJJI(DataChannel dataChannel, EnumC1136790fgj enumC1136790fgj) {
        C16F5 c16f5;
        this.LIZLLL = dataChannel;
        this.LIZJ = enumC1136790fgj;
        this.LJFF = (C1126540fQC) this.LIZ.findViewById(R.id.iy6);
        this.LJI = (C16F5) this.LIZ.findViewById(R.id.uph);
        this.LJII = this.LIZ.findViewById(R.id.yjj);
        TextView textView = (TextView) this.LIZ.findViewById(R.id.e98);
        this.LJIIIIZZ = textView;
        if (textView != null) {
            textView.setTypeface(C1119920fFW.LIZJ(textView.getTextSize(), OppoPermissionPopupMaskDelayExp.DEFAULT, textView.getContext()), 2);
        }
        this.LJIIIZ = (C16F5) this.LIZ.findViewById(R.id.yjo);
        C16F5 c16f52 = this.LJIIIZ;
        if (c16f52 != null) {
            c16f52.setTypeface(C1119920fFW.LIZJ(c16f52.getTextSize(), OppoPermissionPopupMaskDelayExp.DEFAULT, c16f52.getContext()), 2);
        }
        this.LJIIJ = (TextView) this.LIZ.findViewById(R.id.o26);
        EnumC1136790fgj.Companion.getClass();
        int iLIZIZ = 0;
        if (enumC1136790fgj != EnumC1136790fgj.MULTI_HOST_MEDIUM && enumC1136790fgj != EnumC1136790fgj.MULTI_HOST_SMALL) {
            TextView textView2 = this.LJIIIIZZ;
            if (textView2 != null) {
                if (C497740JfY.LJJ()) {
                    iLIZIZ = (int) C497740JfY.LIZIZ(-5.0f);
                }
                C500260Jjc.LJLJJL(iLIZIZ, textView2);
            }
            if (C497740JfY.LJJ() && (c16f5 = this.LJIIIZ) != null) {
                C500260Jjc.LJLJJL((int) C497740JfY.LIZIZ(12.0f), c16f5);
            }
        } else {
            C16F5 c16f53 = this.LJIIIZ;
            if (c16f53 != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(C497740JfY.LJIJI(2131844583));
                sbLIZ.append((char) 160);
                c16f53.setText(C2188811AlT.LIZIZ(sbLIZ));
            }
        }
        View view = this.LJII;
        if (view != null) {
            C786410Ut5.LJLLLLLL(8, view);
        }
    }

    public final void LJJI(C1135810ff9 c1135810ff9, boolean z) {
        float f;
        C1137540fhw c1137540fhw = EnumC1136790fgj.Companion;
        EnumC1136790fgj enumC1136790fgj = this.LIZJ;
        c1137540fhw.getClass();
        if (!C1137540fhw.LIZ(enumC1136790fgj)) {
            if (!C1132700fa8.LJ(c1135810ff9, this.LIZLLL) && !z) {
                f = 27.0f;
            } else {
                f = 23.0f;
            }
            TextView textView = this.LJIIIIZZ;
            if (textView != null) {
                textView.setTextSize(1, f);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0180  */
    @Override // X.InterfaceC1137250fhT
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ(final X.C1135810ff9 r14, final X.EnumC1137240fhS r15, final int r16) {
        /*
            Method dump skipped, instruction units count: 582
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1136110ffd.LJ(X.0ff9, X.0fhS, int):void");
    }
}
