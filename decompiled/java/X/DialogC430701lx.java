package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.MultiGuestLiveShowTransitionDurationSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import webcast.data.multi_guest_play.ShowConfig;

/* JADX INFO: renamed from: X.01lx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class DialogC430701lx extends AbstractDialogC423201kk {
    public final InterfaceC430901lz LLJILJIL;
    public ShowConfig LLJILJILJ;
    public final DataChannel LLJILLL;
    public final int LLJJ;
    public final String LLJJI;
    public LiveIconView LLJJIII;
    public C20743716Ff LLJJIJI;
    public C16FS LLJJIJIIJIL;
    public C16FS LLJJIJIL;
    public C16FS LLJJJ;
    public C16FS LLJJJIL;
    public C16FS LLJJJJ;
    public C16FS LLJJJJJIL;
    public C16FS LLJJJJLIIL;
    public ImageView LLJJL;
    public ViewGroup LLJJLIIIJLLLLLLLZ;
    public C16F5 LLJL;
    public C16F5 LLJLIL;
    public C16F5 LLJLILLLLZIIL;
    public int LLJLL;
    public int LLJLLIL;
    public boolean LLJLLL;
    public final HashMap<Integer, C16FS> LLJZ;
    public TuxSheet LLJZIJLIL;
    public TuxSheet LLL;
    public long LLLF;
    public String LLLFF;

    @Override // X.AbstractDialogC972150bPB
    public final int LJJZZIII() {
        return R.layout.g9g;
    }

    @Override // X.AbstractDialogC423201kk
    public final void LJL() {
        Drawable drawableMutate;
        this.LLJILJIL.LIZ();
        System.currentTimeMillis();
        this.LLJIJIL = this.LLJ;
        this.LLJJIII = (LiveIconView) findViewById(R.id.n6c);
        this.LLJJIJI = (C20743716Ff) findViewById(R.id.ux0);
        this.LLJJIJIIJIL = (C16FS) findViewById(R.id.uwt);
        this.LLJJIJIL = (C16FS) findViewById(R.id.uwu);
        this.LLJJJ = (C16FS) findViewById(R.id.uwm);
        this.LLJJJIL = (C16FS) findViewById(R.id.uwn);
        this.LLJJJJ = (C16FS) findViewById(R.id.uwq);
        this.LLJJJJJIL = (C16FS) findViewById(R.id.uww);
        this.LLJJJJLIIL = (C16FS) findViewById(R.id.uxf);
        this.LLJJL = (ImageView) findViewById(R.id.e1g);
        this.LLJJLIIIJLLLLLLLZ = (ViewGroup) findViewById(R.id.yj_);
        this.LLJL = (C16F5) findViewById(R.id.yja);
        this.LLJLIL = (C16F5) findViewById(R.id.yjc);
        this.LLJLILLLLZIIL = (C16F5) findViewById(R.id.yjb);
        C16FS c16fs = this.LLJJIJIIJIL;
        if (c16fs != null) {
            c16fs.setText(C497740JfY.LJIJJ(2131843576, 3));
        }
        C16FS c16fs2 = this.LLJJIJIL;
        if (c16fs2 != null) {
            c16fs2.setText(C497740JfY.LJIJJ(2131843576, 5));
        }
        C16FS c16fs3 = this.LLJJJ;
        if (c16fs3 != null) {
            c16fs3.setText(C497740JfY.LJIJJ(2131843576, 10));
        }
        C16FS c16fs4 = this.LLJJJIL;
        if (c16fs4 != null) {
            c16fs4.setText(C497740JfY.LJIJJ(2131843576, 15));
        }
        C16FS c16fs5 = this.LLJJJJ;
        if (c16fs5 != null) {
            c16fs5.setText(C497740JfY.LJIJJ(2131843576, 20));
        }
        HashMap<Integer, C16FS> map = this.LLJZ;
        map.put(3, this.LLJJIJIIJIL);
        map.put(5, this.LLJJIJIL);
        map.put(10, this.LLJJJ);
        map.put(15, this.LLJJJIL);
        map.put(20, this.LLJJJJ);
        map.put(0, this.LLJJJJJIL);
        for (C16FS c16fs6 : map.values()) {
            if (c16fs6 != null) {
                c16fs6.LLILLL.LJI(0);
                c16fs6.setBackground(C424030Gjx.LIZ(getContext()));
                c16fs6.setTextColor(C20736316Cj.LIZIZ(R.attr.ewy, getContext()));
                c16fs6.setSelected(false);
            }
        }
        if (C937280aUw.LIZIZ(this.LLJJI)) {
            C16FS c16fs7 = this.LLJJJJLIIL;
            if (c16fs7 != null) {
                C12ES.LJIILL(0, c16fs7);
            }
            ImageView imageView = this.LLJJL;
            if (imageView != null) {
                C12ES.LJIILL(0, imageView);
            }
            LiveIconView liveIconView = this.LLJJIII;
            if (liveIconView != null) {
                C439101nJ.LJI(liveIconView);
            }
        } else {
            C16FS c16fs8 = this.LLJJJJLIIL;
            if (c16fs8 != null) {
                C439101nJ.LJI(c16fs8);
            }
            ImageView imageView2 = this.LLJJL;
            if (imageView2 != null) {
                C439101nJ.LJI(imageView2);
            }
            LiveIconView liveIconView2 = this.LLJJIII;
            if (liveIconView2 != null) {
                C12ES.LJIILL(0, liveIconView2);
            }
        }
        C16FS c16fs9 = this.LLJJJJLIIL;
        if (c16fs9 != null) {
            C786410Ut5.h8(c16fs9, new ViewOnClickListenerC512201z6(this, 47));
        }
        LiveIconView liveIconView3 = this.LLJJIII;
        if (liveIconView3 != null) {
            C786410Ut5.g8(liveIconView3, new ViewOnClickListenerC512201z6(this, 48));
        }
        ImageView imageView3 = this.LLJJL;
        if (imageView3 != null) {
            C786410Ut5.Q7(imageView3, new ViewOnClickListenerC512201z6(this, 49));
        }
        LJLIL();
        LJLJJI(this.LLJJIJIIJIL, 3);
        LJLJJI(this.LLJJIJIL, 5);
        LJLJJI(this.LLJJJ, 10);
        LJLJJI(this.LLJJJIL, 15);
        LJLJJI(this.LLJJJJ, 20);
        LJLJJI(this.LLJJJJJIL, 0);
        C20743716Ff c20743716Ff = this.LLJJIJI;
        if (c20743716Ff != null) {
            ShowConfig showConfig = this.LLJILJILJ;
            c20743716Ff.setChecked(showConfig != null ? C500260Jjc.LJJJI(Boolean.valueOf(showConfig.allowOpenMicFreely)) : false);
            this.LLJLLL = c20743716Ff.isChecked();
            C786410Ut5.k8(c20743716Ff, new ViewOnClickListenerC511801z2(c20743716Ff, this, 13));
        }
        LJLJJL();
        if (MultiGuestLiveShowTransitionDurationSetting.INSTANCE.isAnchorEnableTransition()) {
            ViewGroup viewGroup = this.LLJJLIIIJLLLLLLLZ;
            if (viewGroup != null) {
                C786410Ut5.LJLZ(0, viewGroup);
            }
            C16F5 c16f5 = this.LLJL;
            if (c16f5 != null) {
                c16f5.setText(2131843341);
            }
            C16F5 c16f52 = this.LLJLIL;
            if (c16f52 != null) {
                c16f52.setText(2131843340);
            }
            C16F5 c16f53 = this.LLJLILLLLZIIL;
            if (c16f53 != null) {
                LJLJLLL();
                C786410Ut5.l8(c16f53, new ViewOnClickListenerC512201z6(this, 50));
                Drawable drawableLJIIJ = C497740JfY.LJIIJ(R.drawable.f_s);
                if (drawableLJIIJ == null || (drawableMutate = drawableLJIIJ.mutate()) == null) {
                    drawableMutate = null;
                } else {
                    drawableMutate.setTint(C20736316Cj.LIZIZ(R.attr.ezt, c16f53.getContext()));
                }
                c16f53.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, drawableMutate, (Drawable) null);
            }
        } else {
            ViewGroup viewGroup2 = this.LLJJLIIIJLLLLLLLZ;
            if (viewGroup2 != null) {
                C786410Ut5.LJLZ(8, viewGroup2);
            }
        }
        C16FS c16fs10 = this.LLJZ.get(Integer.valueOf(this.LLJJ));
        int i = this.LLJJ;
        if (i <= 0 || c16fs10 != null) {
            return;
        }
        LJLJJLL(i);
    }

    public final ShowConfig LJLIIIL() {
        ShowConfig showConfig = new ShowConfig();
        int i = this.LLJLLIL;
        if (i == 0) {
            i = this.LLJLL;
        }
        showConfig.durationPerGuest = ((long) i) * 60;
        showConfig.allowOpenMicFreely = this.LLJLLL;
        showConfig.transitionDurationOfConfig = this.LLLF;
        return showConfig;
    }

    public final int LJLIIL() {
        ShowConfig showConfig = this.LLJILJILJ;
        int i = (int) ((showConfig != null ? showConfig.durationPerGuest : 180L) / ((long) 60));
        if (i == 3 || i == 5 || i == 10 || i == 15 || i == 20) {
            return i;
        }
        return 0;
    }

    public final void LJLIL() {
        ShowConfig showConfig = this.LLJILJILJ;
        int i = showConfig != null ? (int) (showConfig.durationPerGuest / ((long) 60)) : 3;
        C16FS c16fs = this.LLJZ.get(Integer.valueOf(i));
        if (c16fs == null) {
            ShowConfig showConfig2 = this.LLJILJILJ;
            if (showConfig2 == null || Integer.valueOf((int) (showConfig2.durationPerGuest / ((long) 60))) == null) {
                return;
            }
            c16fs = this.LLJJJJJIL;
            LJLJJLL(i);
        }
        if (c16fs != null) {
            c16fs.setSelected(true);
            c16fs.setEnabled(true);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJLJLJ() {
        /*
            r5 = this;
            X.0a8R r0 = X.C923330a8R.LIZ
            java.lang.String r0 = "LiveShowSettingsDialog updateShowTimeAndMicPermission"
            X.C923330a8R.LJIILIIL(r0)
            webcast.data.multi_guest_play.ShowConfig r0 = r5.LLJILJILJ
            r4 = 0
            if (r0 == 0) goto L80
            long r2 = r0.durationPerGuest
            r0 = 60
            long r0 = (long) r0
            long r2 = r2 / r0
            int r0 = (int) r2
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
        L17:
            java.lang.String r0 = r5.LLJJI
            boolean r0 = X.C937280aUw.LIZIZ(r0)
            r2 = 0
            if (r0 != 0) goto L34
            X.01Fg r0 = X.C01FQ.LIZ()
            if (r0 == 0) goto L2e
            boolean r0 = r0.LJIJI()
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r0)
        L2e:
            boolean r0 = X.C500260Jjc.LJJJI(r4)
            if (r0 != 0) goto L49
        L34:
            X.16FS r0 = r5.LLJJJJJIL
            if (r0 == 0) goto L49
            boolean r1 = r0.isSelected()
            r0 = 1
            if (r1 != r0) goto L49
            int r1 = r5.LLJLL
            if (r3 == 0) goto L49
            int r0 = r3.intValue()
            if (r0 == r1) goto L52
        L49:
            r5.LJLIL()
            int r0 = r5.LJLIIL()
            r5.LLJLLIL = r0
        L52:
            X.16Ff r1 = r5.LLJJIJI
            if (r1 == 0) goto L71
            webcast.data.multi_guest_play.ShowConfig r0 = r5.LLJILJILJ
            if (r0 == 0) goto L64
            boolean r0 = r0.allowOpenMicFreely
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r2 = X.C500260Jjc.LJJJI(r0)
        L64:
            r5.LLJLLL = r2
            boolean r0 = r1.isChecked()
            if (r2 == r0) goto L71
            boolean r0 = r5.LLJLLL
            r1.setChecked(r0)
        L71:
            webcast.data.multi_guest_play.ShowConfig r0 = r5.LLJILJILJ
            if (r0 == 0) goto L7d
            long r0 = r0.transitionDurationOfConfig
        L77:
            r5.LLLF = r0
            r5.LJLJJL()
            return
        L7d:
            r0 = 0
            goto L77
        L80:
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DialogC430701lx.LJLJLJ():void");
    }

    public final void LJLJLLL() {
        C16F5 c16f5 = this.LLJLILLLLZIIL;
        if (c16f5 != null) {
            long j = this.LLLF;
            long j2 = 60;
            long j3 = j % j2;
            c16f5.setText(j >= 60 ? C497740JfY.LJIJJ(2131843338, Long.valueOf(j / j2), Long.valueOf(j3)) : C497740JfY.LJIJJ(2131843339, Long.valueOf(j3)));
        }
    }

    public static boolean LJLILLLLZI() {
        if (C930540aK4.LIZJ()) {
            return false;
        }
        C923330a8R c923330a8R = C923330a8R.LIZ;
        if (!C923330a8R.LJIIIIZZ()) {
            return false;
        }
        InterfaceC302601Fg interfaceC302601FgLIZ = C01FQ.LIZ();
        return C500260Jjc.LJJJI(interfaceC302601FgLIZ != null ? Boolean.valueOf(interfaceC302601FgLIZ.LJIJI()) : null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0029, code lost:
    
        if (X.C923330a8R.LJIIIIZZ() != false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJLJJL() {
        /*
            Method dump skipped, instruction units count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DialogC430701lx.LJLJJL():void");
    }

    @Override // X.C19GI, android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        this.LLJILJIL.LIZLLL(this.LLLFF);
    }

    @Override // X.AbstractDialogC972150bPB, android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        TuxSheet tuxSheet = this.LLJZIJLIL;
        if (tuxSheet != null) {
            tuxSheet.dismissAllowingStateLoss();
        }
        TuxSheet tuxSheet2 = this.LLL;
        if (tuxSheet2 != null) {
            tuxSheet2.dismissAllowingStateLoss();
        }
    }

    public final void LJLI(int i) {
        Iterator<T> it2 = this.LLJZ.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            Integer num = (Integer) entry.getKey();
            if (num != null && num.intValue() == i) {
                View view = (View) entry.getValue();
                if (view != null) {
                    view.setSelected(true);
                }
                View view2 = (View) entry.getValue();
                if (view2 != null) {
                    view2.setEnabled(true);
                }
            }
        }
        for (View view3 : this.LLJZ.values()) {
            if (view3 != null) {
                view3.setSelected(false);
            }
        }
        C16FS c16fs = this.LLJZ.get(Integer.valueOf(i));
        if (c16fs != null) {
            c16fs.setSelected(true);
        }
        this.LLJLLIL = i;
        this.LLJILJIL.LIZJ(LJLIIIL());
    }

    public final void LJLJI(ShowConfig showConfig) {
        this.LLJILJILJ = showConfig;
        if (C930540aK4.LIZJ()) {
            if (C923340a8S.LIZ() != 0) {
                LJLJLJ();
            }
        } else {
            C923330a8R c923330a8R = C923330a8R.LIZ;
            if (C923330a8R.LJIIIIZZ()) {
                LJLJLJ();
            }
        }
        LJLJLLL();
    }

    public final void LJLJJLL(int i) {
        C16FS c16fs = this.LLJJJJJIL;
        if (c16fs != null) {
            c16fs.setText(C497740JfY.LJIJJ(2131843576, Integer.valueOf(i)));
        }
        this.LLJLL = i;
    }

    public final void LJLJJI(C16FS c16fs, final int i) {
        Boolean boolValueOf;
        if (!C937280aUw.LIZIZ(this.LLJJI)) {
            InterfaceC302601Fg interfaceC302601FgLIZ = C01FQ.LIZ();
            if (interfaceC302601FgLIZ != null) {
                boolValueOf = Boolean.valueOf(interfaceC302601FgLIZ.LJIJI());
            } else {
                boolValueOf = null;
            }
            if (C500260Jjc.LJJJI(boolValueOf)) {
                return;
            }
        }
        if (c16fs != null) {
            C786410Ut5.h8(c16fs, new View.OnClickListener() { // from class: X.01ly
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    FragmentManager fragmentManager;
                    int i2 = i;
                    if (i2 != 0) {
                        if (i2 != 3) {
                            if (i2 != 5) {
                                if (i2 != 10) {
                                    if (i2 != 15) {
                                        if (i2 == 20) {
                                            C306901Gx.LJIJJ("20mins");
                                        }
                                    } else {
                                        C306901Gx.LJIJJ("15mins");
                                    }
                                } else {
                                    C306901Gx.LJIJJ("10mins");
                                }
                            } else {
                                C306901Gx.LJIJJ("5mins");
                            }
                        } else {
                            C306901Gx.LJIJJ("3mins");
                        }
                    } else {
                        C306901Gx.LJIJJ("edit");
                    }
                    int i3 = i;
                    if (i3 == 0) {
                        DataChannel dataChannel = this.LLJILLL;
                        if (dataChannel != null && (fragmentManager = (FragmentManager) dataChannel.gg0(C748880TZe.class)) != null) {
                            TuxSheet tuxSheet = this.LLJZIJLIL;
                            if (tuxSheet != null) {
                                tuxSheet.dismissAllowingStateLoss();
                            }
                            DialogC430701lx dialogC430701lx = this;
                            C1579100rC8 c1579100rC8 = new C1579100rC8();
                            c1579100rC8.LJI = C497740JfY.LJIJI(2131853899);
                            c1579100rC8.LIZJ(5);
                            c1579100rC8.LIZLLL(60000L, 3600000L);
                            c1579100rC8.LIZIZ(((long) (this.LLJLL * LSPassThroughRecordSizeConfig.DEFAULT)) * 60);
                            c1579100rC8.LJII = C497740JfY.LJIJI(2131853901);
                            c1579100rC8.LJ = new C5183020f(this, 193);
                            dialogC430701lx.LLJZIJLIL = c1579100rC8.LIZ().LIZ;
                            TuxSheet tuxSheet2 = this.LLJZIJLIL;
                            if (tuxSheet2 != null) {
                                tuxSheet2.show(fragmentManager, "LiveShowDurationEditSheet");
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    this.LJLI(i3);
                }
            });
        }
    }

    public DialogC430701lx(Context context, InterfaceC430901lz interfaceC430901lz, ShowConfig showConfig, DataChannel dataChannel, int i, String str) {
        boolean z;
        long j;
        super(context, !C937280aUw.LIZIZ(str));
        this.LLJILJIL = interfaceC430901lz;
        this.LLJILJILJ = showConfig;
        this.LLJILLL = dataChannel;
        this.LLJJ = i;
        this.LLJJI = str;
        this.LLJLL = 5;
        this.LLJLLIL = 5;
        this.LLJZ = new HashMap<>();
        this.LLLFF = "other";
        this.LLJLLIL = LJLIIL();
        ShowConfig showConfig2 = this.LLJILJILJ;
        if (showConfig2 != null) {
            z = showConfig2.allowOpenMicFreely;
        } else {
            z = false;
        }
        this.LLJLLL = z;
        if (showConfig2 != null) {
            j = showConfig2.transitionDurationOfConfig;
        } else {
            j = 0;
        }
        this.LLLF = j;
    }
}
