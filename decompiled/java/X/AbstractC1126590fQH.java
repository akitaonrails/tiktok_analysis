package X;

import Y.ACListenerS120S0200000_17;
import Y.ATListenerS450S0100000_17;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.api.revenue.level.IUserLevelService;
import com.bytedance.android.livesdk.gift.model.GiftsInfo;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.OppoPermissionPopupMaskDelayExp;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AFwS254S0000000_17;
import kotlin.jvm.internal.AwS253S0000000_17;
import kotlin.jvm.internal.AwS561S0100000_17;

/* JADX INFO: renamed from: X.0fQH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public abstract class AbstractC1126590fQH extends RecyclerView.ViewHolder {
    public final View LL;
    public ViewGroup LLILLJJLI;
    public ImageView LLILLL;
    public C16F5 LLILZ;
    public C1324720kZq LLILZIL;
    public DataChannel LLILZLL;
    public ImageView LLIZ;
    public AbstractC1126600fQI<?> LLIZLLLIL;
    public InterfaceC1126640fQM LLJ;
    public View LLJI;
    public C16F5 LLJIJIL;
    public C16F5 LLJILJIL;
    public boolean LLJILJILJ;
    public boolean LLJILLL;
    public boolean LLJJ;
    public LiveIconView LLJJI;
    public C16F5 LLJJIII;
    public final C11NJ LLJJIJI;
    public boolean LLJJIJIIJIL;
    public boolean LLJJIJIL;

    public boolean R5() {
        return false;
    }

    public void onDestroy() {
    }

    public final void I5() {
        AbstractC1126600fQI<?> abstractC1126600fQI = this.LLIZLLLIL;
        if (abstractC1126600fQI == null || !abstractC1126600fQI.LJIILLIIL()) {
            return;
        }
        GiftsInfo.LevelUpGiftInfo levelUpGiftInfo = C1123390fL7.LIZ;
        if (C1123390fL7.LIZJ(this.LLIZLLLIL)) {
            return;
        }
        C16F5 c16f5 = this.LLJJIII;
        if (c16f5 != null) {
            c16f5.setBackgroundResource(R.drawable.ex0);
        }
        C16F5 c16f52 = this.LLJJIII;
        if (c16f52 != null) {
            C786410Ut5.LLJJJJ(c16f52, 0);
        }
        C16F5 c16f53 = this.LLJJIII;
        if (c16f53 != null) {
            c16f53.setTextColor(C20736316Cj.LIZIZ(R.attr.c9i, this.LL.getContext()));
        }
    }

    public void N5() {
        InterfaceC1126640fQM interfaceC1126640fQM = this.LLJ;
        if (interfaceC1126640fQM != null) {
            interfaceC1126640fQM.LJIIJJI(true);
        }
        this.LLJJ = false;
        C500260Jjc.LLFFF(this.LLILLJJLI);
        InterfaceC1126640fQM interfaceC1126640fQM2 = this.LLJ;
        if ((interfaceC1126640fQM2 != null ? interfaceC1126640fQM2.LJIIIIZZ() : null) == this.LLIZLLLIL) {
            V5();
        }
    }

    public final void T5() {
        ImageModel imageModelLJIIIIZZ;
        ImageView imageView;
        ImageModel imageModelLJIIIIZZ2;
        ImageModel imageModel;
        ImageView imageView2;
        ImageView imageView3 = this.LLILLL;
        if (imageView3 != null) {
            C786410Ut5.LJZI(8, imageView3);
        }
        this.LLJJIJIL = false;
        AbstractC1126600fQI<?> abstractC1126600fQI = this.LLIZLLLIL;
        String uri = null;
        if ((abstractC1126600fQI != null ? abstractC1126600fQI.LJIILLIIL : null) != null) {
            CopyOnWriteArrayList<C1125840fP4> copyOnWriteArrayList = C1125820fP2.LIZ;
            if (C1125820fP2.LJII(abstractC1126600fQI != null ? Long.valueOf(abstractC1126600fQI.LJI()) : null, null)) {
                AbstractC1126600fQI<?> abstractC1126600fQI2 = this.LLIZLLLIL;
                if (abstractC1126600fQI2 != null && !abstractC1126600fQI2.LIZJ && !C1125820fP2.LIZIZ(Long.valueOf(abstractC1126600fQI2.LJI())) && (imageView2 = this.LLILLL) != null) {
                    C500260Jjc.LLFFF(imageView2);
                }
                AbstractC1126600fQI<?> abstractC1126600fQI3 = this.LLIZLLLIL;
                if (abstractC1126600fQI3 == null || (imageModel = abstractC1126600fQI3.LJIILLIIL) == null) {
                    return;
                }
                this.LLJJIJIL = true;
                C1126570fQF.LIZLLL(this.LLILLL, imageModel, 0, 0, 0, new C1151970g5D(this, 5), 60);
                return;
            }
        }
        AbstractC1126600fQI<?> abstractC1126600fQI4 = this.LLIZLLLIL;
        if (abstractC1126600fQI4 != null && (imageModelLJIIIIZZ2 = abstractC1126600fQI4.LJIIIIZZ()) != null) {
            uri = imageModelLJIIIIZZ2.getUri();
        }
        if (!C500260Jjc.LJJIIZ(uri)) {
            ImageView imageView4 = this.LLILLL;
            if (imageView4 != null) {
                C786410Ut5.LJZI(8, imageView4);
                return;
            }
            return;
        }
        AbstractC1126600fQI<?> abstractC1126600fQI5 = this.LLIZLLLIL;
        if (abstractC1126600fQI5 != null && !abstractC1126600fQI5.LIZJ && (imageView = this.LLILLL) != null) {
            C500260Jjc.LLFFF(imageView);
        }
        AbstractC1126600fQI<?> abstractC1126600fQI6 = this.LLIZLLLIL;
        if (abstractC1126600fQI6 == null || (imageModelLJIIIIZZ = abstractC1126600fQI6.LJIIIIZZ()) == null) {
            return;
        }
        this.LLJJIJIL = true;
        C1126570fQF.LIZLLL(this.LLILLL, imageModelLJIIIIZZ, 0, 0, 0, new C1151970g5D(this, 5), 60);
    }

    public void U5() {
        this.LLILLL = (ImageView) this.LL.findViewById(R.id.mk_);
        this.LLILZ = (C16F5) this.LL.findViewById(R.id.p6q);
        this.LLILZIL = (C1324720kZq) this.LL.findViewById(R.id.p6p);
        this.LLJI = this.LL.findViewById(R.id.yru);
        this.LLJIJIL = (C16F5) this.LL.findViewById(R.id.l1q);
        this.LLJILJIL = (C16F5) this.LL.findViewById(R.id.l3r);
        this.LLILLJJLI = (ViewGroup) this.LL.findViewById(R.id.eux);
        C16F5 c16f5 = this.LLJILJIL;
        if (c16f5 != null) {
            c16f5.setTypeface(C1119920fFW.LIZJ(c16f5.getTextSize(), OppoPermissionPopupMaskDelayExp.DEFAULT, this.LL.getContext()));
        }
        C16F5 c16f52 = this.LLILZ;
        if (c16f52 != null) {
            c16f52.setTypeface(C1119920fFW.LIZJ(c16f52.getTextSize(), 500, this.LL.getContext()));
        }
        this.LLJJIII = (C16F5) this.LL.findViewById(R.id.l3w);
        this.LLJJI = (LiveIconView) this.LL.findViewById(R.id.wj0);
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void V5() {
        /*
            r5 = this;
            android.view.View r0 = r5.LLJI
            r3 = 0
            if (r0 == 0) goto L8
            X.C786410Ut5.LJLLLLLL(r3, r0)
        L8:
            com.bytedance.android.live.design.view.icon.LiveIconView r0 = r5.LLJJI
            if (r0 == 0) goto L18
            r1 = 8
            X.C786410Ut5.LLJJIJIL(r0, r1)
            android.widget.ImageView r0 = r5.LLILLL
            if (r0 == 0) goto L18
            X.C786410Ut5.LJZI(r1, r0)
        L18:
            X.0fQM r0 = r5.LLJ
            r4 = 1
            if (r0 == 0) goto Lb2
            boolean r0 = r0.LJIIIZ()
            if (r0 != r4) goto Lb2
            r0 = 1
        L24:
            r2 = 4
            if (r0 == 0) goto L40
            X.16F5 r0 = r5.LLJJIII
            if (r0 == 0) goto L2e
            X.C786410Ut5.LLJJJJ(r0, r3)
        L2e:
            X.16F5 r0 = r5.LLJIJIL
            if (r0 == 0) goto L35
            X.C786410Ut5.LLJJJJ(r0, r2)
        L35:
            X.16F5 r0 = r5.LLJILJIL
            if (r0 == 0) goto L3c
            X.C786410Ut5.LLJJJJ(r0, r2)
        L3c:
            r5.d6()
            return
        L40:
            X.0fRW r1 = X.C1131370fXz.LJ
            X.0fRW r0 = X.EnumC1127360fRW.ItemCountdown
            if (r1 != r0) goto L5c
            X.16F5 r0 = r5.LLJIJIL
            if (r0 == 0) goto L4d
            X.C786410Ut5.LLJJJJ(r0, r3)
        L4d:
            X.16F5 r0 = r5.LLJILJIL
            if (r0 == 0) goto L54
            X.C786410Ut5.LLJJJJ(r0, r2)
        L54:
            X.16F5 r0 = r5.LLJJIII
            if (r0 == 0) goto L3c
            X.C786410Ut5.LLJJJJ(r0, r2)
            goto L3c
        L5c:
            X.0fQI<?> r0 = r5.LLIZLLLIL
            r1 = 0
            if (r0 == 0) goto L63
            T extends X.0054 r1 = r0.LIZIZ
        L63:
            boolean r0 = r1 instanceof com.bytedance.android.livesdk.model.Gift
            if (r0 == 0) goto L8c
            com.bytedance.android.livesdk.model.Gift r1 = (com.bytedance.android.livesdk.model.Gift) r1
            if (r1 == 0) goto L8c
            com.bytedance.android.livesdk.model.GiftLockInfo r0 = r1.giftSubInfo
            if (r0 == 0) goto L8c
            boolean r0 = r0.mLock
            if (r0 != r4) goto L8c
        L73:
            X.16F5 r0 = r5.LLJJIII
            if (r0 == 0) goto L7a
            X.C786410Ut5.LLJJJJ(r0, r3)
        L7a:
            r5.I5()
            X.16F5 r0 = r5.LLJILJIL
            if (r0 == 0) goto L84
            X.C786410Ut5.LLJJJJ(r0, r2)
        L84:
            X.16F5 r0 = r5.LLJIJIL
            if (r0 == 0) goto L3c
            X.C786410Ut5.LLJJJJ(r0, r2)
            goto L3c
        L8c:
            boolean r0 = r5.X5()
            if (r0 != 0) goto L73
            com.bytedance.android.livesdk.gift.model.GiftsInfo$LevelUpGiftInfo r0 = X.C1123390fL7.LIZ
            X.0fQI<?> r0 = r5.LLIZLLLIL
            boolean r0 = X.C1123390fL7.LIZJ(r0)
            if (r0 != 0) goto L73
            X.16F5 r0 = r5.LLJILJIL
            if (r0 == 0) goto La3
            X.C786410Ut5.LLJJJJ(r0, r3)
        La3:
            X.16F5 r0 = r5.LLJJIII
            if (r0 == 0) goto Laa
            X.C786410Ut5.LLJJJJ(r0, r2)
        Laa:
            X.16F5 r0 = r5.LLJIJIL
            if (r0 == 0) goto L3c
            X.C786410Ut5.LLJJJJ(r0, r2)
            goto L3c
        Lb2:
            r0 = 0
            goto L24
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC1126590fQH.V5():void");
    }

    public void W5() {
        AbstractC1126600fQI<?> abstractC1126600fQI;
        AbstractC1126600fQI<?> abstractC1126600fQI2;
        AbstractC1126600fQI<?> abstractC1126600fQI3;
        AbstractC1126600fQI<?> abstractC1126600fQI4;
        AbstractC1126600fQI<?> abstractC1126600fQI5;
        ImageView imageView;
        View view = this.LLJI;
        if (view != null) {
            C786410Ut5.LJLLLLLL(4, view);
        }
        if (this.LLJJIJIL && (imageView = this.LLILLL) != null) {
            C786410Ut5.LJZI(0, imageView);
        }
        AbstractC1126600fQI<?> abstractC1126600fQI6 = this.LLIZLLLIL;
        if ((abstractC1126600fQI6 == null || !abstractC1126600fQI6.LJIJ()) && (((abstractC1126600fQI = this.LLIZLLLIL) == null || !abstractC1126600fQI.LJIJI()) && (((abstractC1126600fQI2 = this.LLIZLLLIL) == null || !abstractC1126600fQI2.LJJIFFI()) && (((abstractC1126600fQI3 = this.LLIZLLLIL) == null || !abstractC1126600fQI3.LJIL()) && (((abstractC1126600fQI4 = this.LLIZLLLIL) == null || !abstractC1126600fQI4.LJIILL()) && ((abstractC1126600fQI5 = this.LLIZLLLIL) == null || !abstractC1126600fQI5.LJIIZILJ())))))) {
            LiveIconView liveIconView = this.LLJJI;
            if (liveIconView != null) {
                C786410Ut5.LLJJIJIL(liveIconView, 8);
                return;
            }
            return;
        }
        LiveIconView liveIconView2 = this.LLJJI;
        if (liveIconView2 != null) {
            C786410Ut5.LLJJIJIL(liveIconView2, 0);
        }
    }

    public final boolean X5() {
        C1094360eaI c1094360eaIHP = ((IUserLevelService) C1161920gLG.LIZJ(IUserLevelService.class)).HP();
        boolean z = c1094360eaIHP != null && c1094360eaIHP.LJFF == 2;
        AbstractC1126600fQI<?> abstractC1126600fQI = this.LLIZLLLIL;
        return abstractC1126600fQI != null && abstractC1126600fQI.LJJIII() && z;
    }

    public final void d6() {
        if (this.LLJILJILJ) {
            if (this.LLJILLL) {
                C16F5 c16f5 = this.LLJJIII;
                if (c16f5 != null) {
                    C786410Ut5.LLJJJJ(c16f5, 0);
                }
                C16F5 c16f52 = this.LLJILJIL;
                if (c16f52 != null) {
                    C786410Ut5.LLJJJJ(c16f52, 4);
                }
            }
            if (this.LLJILLL) {
                return;
            }
            C16F5 c16f53 = this.LLJILJIL;
            if (c16f53 == null || c16f53.getVisibility() != 0) {
                C16F5 c16f54 = this.LLJJIII;
                if (c16f54 != null) {
                    C786410Ut5.LLJJJJ(c16f54, 4);
                }
                C16F5 c16f55 = this.LLJILJIL;
                if (c16f55 != null) {
                    C786410Ut5.LLJJJJ(c16f55, 0);
                }
            }
        }
    }

    public AbstractC1126590fQH(View view) {
        super(view);
        this.LL = view;
        this.LLJJIJI = new C11NJ();
        U5();
    }

    public void P5(int i) {
        this.LLJJIJIIJIL = true;
    }

    public void S5(final int i) {
        long jLJI;
        String str;
        ImageModel imageModelLJII;
        List urls;
        AbstractC1126600fQI<?> abstractC1126600fQI = this.LLIZLLLIL;
        ImageModel imageModelLJII2 = null;
        if (abstractC1126600fQI != null && abstractC1126600fQI.LJII() != null) {
            AbstractC1126600fQI<?> abstractC1126600fQI2 = this.LLIZLLLIL;
            if (abstractC1126600fQI2 != null) {
                jLJI = abstractC1126600fQI2.LJI();
            } else {
                jLJI = -1;
            }
            AbstractC1126600fQI<?> abstractC1126600fQI3 = this.LLIZLLLIL;
            if (abstractC1126600fQI3 == null || (imageModelLJII = abstractC1126600fQI3.LJII()) == null || (urls = imageModelLJII.getUrls()) == null || (str = (String) ListProtector.get(urls, 0)) == null) {
                str = "";
            }
            this.LLJJIJI.LIZ(C1239300iM4.LJ(C11NZ.LJIJJLI(new C1127280fRO(jLJI, UriProtector.parse(str), null)), AFwS254S0000000_17.get$arr$(446), C1239300iM4.LIZJ, new AwS253S0000000_17(1)));
            C1126570fQF.LIZJ();
            C1324720kZq c1324720kZq = this.LLILZIL;
            AbstractC1126600fQI<?> abstractC1126600fQI4 = this.LLIZLLLIL;
            if (abstractC1126600fQI4 != null) {
                imageModelLJII2 = abstractC1126600fQI4.LJII();
            }
            C1324570kZb.LIZJ(c1324720kZq, imageModelLJII2, C497740JfY.LJII().getResources().getDrawable(R.drawable.et9), null, new C0IYA() { // from class: X.0fQX
                public long LIZ;

                @Override // X.C0IYA, X.InterfaceC1142670fqD
                public final void LIZ() {
                    AbstractC1126600fQI<?> abstractC1126600fQI5 = this.LIZIZ.LLIZLLLIL;
                    if (abstractC1126600fQI5 != null) {
                        C1128250fSx.LIZ.LJFF(abstractC1126600fQI5.LJI());
                    }
                    this.LIZ = SystemClock.elapsedRealtime();
                }

                @Override // X.C0IYA, X.InterfaceC1142670fqD
                public final void LIZLLL(String str2, Exception exc) {
                    long jLJI2;
                    String message;
                    AbstractC1126600fQI<?> abstractC1126600fQI5 = this.LIZIZ.LLIZLLLIL;
                    boolean z = false;
                    if (abstractC1126600fQI5 != null && abstractC1126600fQI5.LIZ == 1) {
                        z = true;
                    }
                    long jLJI3 = -1;
                    if (z) {
                        if (abstractC1126600fQI5 != null) {
                            jLJI2 = abstractC1126600fQI5.LJI();
                        } else {
                            jLJI2 = -1;
                        }
                        if (exc == null || (message = exc.getMessage()) == null) {
                            message = "";
                        }
                        C1131270fXp.LIZLLL(jLJI2, str2, message);
                    }
                    try {
                        C1128240fSw c1128240fSw = C1128250fSx.LIZ;
                        AbstractC1126600fQI<?> abstractC1126600fQI6 = this.LIZIZ.LLIZLLLIL;
                        if (abstractC1126600fQI6 != null) {
                            jLJI3 = abstractC1126600fQI6.LJI();
                        }
                        c1128240fSw.LJ(jLJI3);
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }

                @Override // X.C0IYA, X.InterfaceC1142670fqD
                public final void LIZJ(int i2, int i3, String str2) {
                    boolean z;
                    long jLJI2;
                    long jLJI3;
                    AbstractC1126600fQI<?> abstractC1126600fQI5 = this.LIZIZ.LLIZLLLIL;
                    if (abstractC1126600fQI5 != null && abstractC1126600fQI5.LIZ == 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    long jLJI4 = -1;
                    if (z) {
                        if (abstractC1126600fQI5 != null) {
                            jLJI3 = abstractC1126600fQI5.LJI();
                        } else {
                            jLJI3 = -1;
                        }
                        C1131270fXp.LJ(jLJI3, str2);
                    }
                    if (C1130220fW8.LIZ.LIZ) {
                        C1128590fTV.LJJIJ++;
                    }
                    C1128590fTV.LJJIJIIJI++;
                    long jElapsedRealtime = SystemClock.elapsedRealtime() - this.LIZ;
                    AbstractC1126600fQI<?> abstractC1126600fQI6 = this.LIZIZ.LLIZLLLIL;
                    if (abstractC1126600fQI6 != null) {
                        jLJI2 = abstractC1126600fQI6.LJI();
                    } else {
                        jLJI2 = -1;
                    }
                    if (str2 == null) {
                        str2 = "";
                    }
                    C1126770fQZ.LIZ(jElapsedRealtime, jLJI2, str2);
                    try {
                        C1128240fSw c1128240fSw = C1128250fSx.LIZ;
                        AbstractC1126600fQI<?> abstractC1126600fQI7 = this.LIZIZ.LLIZLLLIL;
                        if (abstractC1126600fQI7 != null) {
                            jLJI4 = abstractC1126600fQI7.LJI();
                        }
                        c1128240fSw.LIZLLL(jLJI4);
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                    this.LIZIZ.P5(i);
                }
            }, false);
        }
    }

    public void a6(long j) {
        String strLIZIZ;
        String strLIZIZ2;
        if (j > 0) {
            int i = (int) (j / ((long) LSPassThroughRecordSizeConfig.DEFAULT));
            int i2 = i / 60;
            int i3 = i % 60;
            if (i2 >= 10) {
                strLIZIZ = String.valueOf(i2);
            } else {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append('0');
                sbLIZ.append(i2);
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            }
            if (i3 >= 10) {
                strLIZIZ2 = String.valueOf(i3);
            } else {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append('0');
                sbLIZ2.append(i3);
                strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
            }
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append(strLIZIZ);
            sbLIZ3.append(" : ");
            sbLIZ3.append(strLIZIZ2);
            String strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ3);
            C16F5 c16f5 = this.LLJIJIL;
            if (c16f5 != null) {
                c16f5.setText(strLIZIZ3);
            }
        }
    }

    public void b6(InterfaceC1126640fQM interfaceC1126640fQM) {
        C786410Ut5.I7(new ACListenerS120S0200000_17(interfaceC1126640fQM, this, 35), this.LL);
        this.LL.setOnTouchListener(new ATListenerS450S0100000_17(this, 15));
        this.LLJ = interfaceC1126640fQM;
    }

    public void c6(long j) {
        Object obj;
        Gift gift;
        AbstractC1126600fQI<?> abstractC1126600fQI = this.LLIZLLLIL;
        if (abstractC1126600fQI != null && j == abstractC1126600fQI.LJI()) {
            AbstractC1126600fQI<?> abstractC1126600fQI2 = this.LLIZLLLIL;
            if (abstractC1126600fQI2 == null || (abstractC1126600fQI2 instanceof C1126040fPO)) {
                Boolean boolValueOf = null;
                if (abstractC1126600fQI2 != null) {
                    obj = abstractC1126600fQI2.LIZIZ;
                } else {
                    obj = null;
                }
                if ((obj instanceof Gift) && (gift = (Gift) obj) != null) {
                    boolValueOf = Boolean.valueOf(gift.LJIIIZ());
                }
                if (!C500260Jjc.LJJJI(boolValueOf)) {
                    C500260Jjc.LJIILLIIL(this.LLILLJJLI);
                    InterfaceC1126640fQM interfaceC1126640fQM = this.LLJ;
                    if (interfaceC1126640fQM != null) {
                        interfaceC1126640fQM.LJJIIZ(j, this.LL.getX(), this.LL.getY(), getBindingAdapterPosition(), new AwS561S0100000_17(this, 646));
                    }
                    W5();
                    this.LLJJ = true;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x014f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void L5(X.AbstractC1126600fQI<?> r9, com.bytedance.ies.sdk.datachannel.DataChannel r10, int r11, int r12) {
        /*
            Method dump skipped, instruction units count: 481
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC1126590fQH.L5(X.0fQI, com.bytedance.ies.sdk.datachannel.DataChannel, int, int):void");
    }
}
