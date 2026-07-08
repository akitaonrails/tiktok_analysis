package Y;

import X.AnonymousClass1677;
import X.C0IJT;
import X.C1782790wUf;
import X.C1782800wUg;
import X.C1840250xzL;
import X.C21513519Hh;
import X.C474500IjA;
import X.C817403Hg;
import X.EnumC1782750wUb;
import android.graphics.Bitmap;
import android.graphics.PointF;
import android.view.View;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.common.utility.BitmapUtils;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.live.livehostimpl.edit.EmoteEditDialogFragment;
import com.ss.android.ugc.aweme.live.livehostimpl.edit.SpotlightImageEditDialogFragment;
import java.util.Map;

/* JADX INFO: loaded from: classes32.dex */
public class ACListenerS7S0200001_31 implements View.OnClickListener {
    public final int $t;
    public float f2;
    public Object l0;
    public Object l1;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                break;
            case 1:
                onClick$1(this, view);
                break;
        }
    }

    public static final void onClick$0(ACListenerS7S0200001_31 aCListenerS7S0200001_31, View view) {
        int width;
        int i;
        EnumC1782750wUb enumC1782750wUb;
        Map<String, Object> map;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_sub_emote_edit_page_add_rotate");
        AnonymousClass1677 anonymousClass1677 = ((EmoteEditDialogFragment) aCListenerS7S0200001_31.l0).LLJJIII;
        if (anonymousClass1677 != null && (map = anonymousClass1677.LJ) != null) {
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                c474500IjALIZ.LJJII(entry.getValue().toString(), entry.getKey());
            }
        }
        c474500IjALIZ.LIZ();
        EmoteEditDialogFragment emoteEditDialogFragment = (EmoteEditDialogFragment) aCListenerS7S0200001_31.l0;
        int height = 0;
        emoteEditDialogFragment.LLLFFI = false;
        C1840250xzL c1840250xzLVR = emoteEditDialogFragment.VR();
        if (c1840250xzLVR != null) {
            c1840250xzLVR.LIZIZ();
        }
        C1840250xzL c1840250xzLVR2 = ((EmoteEditDialogFragment) aCListenerS7S0200001_31.l0).VR();
        if (c1840250xzLVR2 != null) {
            HandlerHook.viewPostDelay(c1840250xzLVR2, new ARunnableS131S0100000_31((EmoteEditDialogFragment) aCListenerS7S0200001_31.l0, 66), Mp4ScreenVideoLoadTimeout.CONTROL);
        }
        ((EmoteEditDialogFragment) aCListenerS7S0200001_31.l0).SR().LJII();
        EmoteEditDialogFragment emoteEditDialogFragment2 = (EmoteEditDialogFragment) aCListenerS7S0200001_31.l0;
        emoteEditDialogFragment2.LLJJIJI = BitmapUtils.rotateBitmap(emoteEditDialogFragment2.LLJJIJI, 90);
        ((EmoteEditDialogFragment) aCListenerS7S0200001_31.l0).SR().setImageBitmap(((EmoteEditDialogFragment) aCListenerS7S0200001_31.l0).LLJJIJI);
        Bitmap bitmap = ((EmoteEditDialogFragment) aCListenerS7S0200001_31.l0).LLJJIJI;
        if (bitmap != null) {
            width = bitmap.getWidth();
        } else {
            width = 0;
        }
        Bitmap bitmap2 = ((EmoteEditDialogFragment) aCListenerS7S0200001_31.l0).LLJJIJI;
        if (bitmap2 != null) {
            height = bitmap2.getHeight();
        }
        AnonymousClass1677 anonymousClass16772 = ((EmoteEditDialogFragment) aCListenerS7S0200001_31.l0).LLJJIII;
        if (anonymousClass16772 != null && (enumC1782750wUb = anonymousClass16772.LIZIZ) != null) {
            i = C1782790wUf.LIZ[enumC1782750wUb.ordinal()];
        } else {
            i = -1;
        }
        if (i != 1) {
            if (i != 2) {
                EmoteEditDialogFragment emoteEditDialogFragment3 = (EmoteEditDialogFragment) aCListenerS7S0200001_31.l0;
                if (emoteEditDialogFragment3.LLJJIJI != null && height < width && height > 0 && emoteEditDialogFragment3.LLJLLL > 0) {
                    C21513519Hh c21513519HhSR = emoteEditDialogFragment3.SR();
                    if (c21513519HhSR != null) {
                        c21513519HhSR.LJIIIZ(new PointF(500.0f, 1000.0f), 1.0E-4f, 600.0f, new PointF(200.0f, 500.0f));
                    }
                    C21513519Hh c21513519HhSR2 = ((EmoteEditDialogFragment) aCListenerS7S0200001_31.l0).SR();
                    if (c21513519HhSR2 != null) {
                        c21513519HhSR2.LJIIJJI(1L);
                    }
                    C21513519Hh c21513519HhSR3 = ((EmoteEditDialogFragment) aCListenerS7S0200001_31.l0).SR();
                    if (c21513519HhSR3 != null) {
                        HandlerHook.viewPostDelay(c21513519HhSR3, new ARunnableS100S0200000_31((EmoteEditDialogFragment) aCListenerS7S0200001_31.l0, (C817403Hg) aCListenerS7S0200001_31.l1, 21), 50L);
                    }
                }
            } else {
                EmoteEditDialogFragment emoteEditDialogFragment4 = (EmoteEditDialogFragment) aCListenerS7S0200001_31.l0;
                if (emoteEditDialogFragment4.LLJJIJI != null && height < width && height > 0 && emoteEditDialogFragment4.LLJLLL > 0) {
                    C21513519Hh c21513519HhSR4 = emoteEditDialogFragment4.SR();
                    if (c21513519HhSR4 != null) {
                        c21513519HhSR4.LJIIIZ(new PointF(500.0f, 1000.0f), 1.0E-4f, 600.0f, new PointF(200.0f, 500.0f));
                    }
                    C21513519Hh c21513519HhSR5 = ((EmoteEditDialogFragment) aCListenerS7S0200001_31.l0).SR();
                    if (c21513519HhSR5 != null) {
                        c21513519HhSR5.LJIIJJI(1L);
                    }
                    C21513519Hh c21513519HhSR6 = ((EmoteEditDialogFragment) aCListenerS7S0200001_31.l0).SR();
                    if (c21513519HhSR6 != null) {
                        HandlerHook.viewPostDelay(c21513519HhSR6, new ARunnableS100S0200000_31((EmoteEditDialogFragment) aCListenerS7S0200001_31.l0, (C817403Hg) aCListenerS7S0200001_31.l1, 20), 50L);
                    }
                } else {
                    C21513519Hh c21513519HhSR7 = emoteEditDialogFragment4.SR();
                    if (c21513519HhSR7 != null) {
                        c21513519HhSR7.LJIIIZ(new PointF(0.0f, aCListenerS7S0200001_31.f2), 1.0f, 1.0f, new PointF(0.0f, 0.0f));
                    }
                    C21513519Hh c21513519HhSR8 = ((EmoteEditDialogFragment) aCListenerS7S0200001_31.l0).SR();
                    if (c21513519HhSR8 != null) {
                        c21513519HhSR8.LJIIJJI(null);
                    }
                }
            }
        } else {
            C21513519Hh c21513519HhSR9 = ((EmoteEditDialogFragment) aCListenerS7S0200001_31.l0).SR();
            if (c21513519HhSR9 != null) {
                c21513519HhSR9.LJIIIZ(new PointF(500.0f, 1000.0f), 1.0E-4f, 600.0f, new PointF(200.0f, 500.0f));
            }
            C21513519Hh c21513519HhSR10 = ((EmoteEditDialogFragment) aCListenerS7S0200001_31.l0).SR();
            if (c21513519HhSR10 != null) {
                c21513519HhSR10.LJIIJJI(1L);
            }
        }
        C21513519Hh c21513519HhSR11 = ((EmoteEditDialogFragment) aCListenerS7S0200001_31.l0).SR();
        if (c21513519HhSR11 != null) {
            HandlerHook.viewPostDelay(c21513519HhSR11, new ARunnableS131S0100000_31((EmoteEditDialogFragment) aCListenerS7S0200001_31.l0, 67), 100L);
        }
    }

    public static final void onClick$1(ACListenerS7S0200001_31 aCListenerS7S0200001_31, View view) {
        int width;
        int i;
        EnumC1782750wUb enumC1782750wUb;
        SpotlightImageEditDialogFragment spotlightImageEditDialogFragment = (SpotlightImageEditDialogFragment) aCListenerS7S0200001_31.l0;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_subscription_highlight_rotate_click");
        spotlightImageEditDialogFragment.dS(c474500IjALIZ);
        c474500IjALIZ.LJJII(spotlightImageEditDialogFragment.LLLII, "show_entrance");
        c474500IjALIZ.LIZ();
        SpotlightImageEditDialogFragment spotlightImageEditDialogFragment2 = (SpotlightImageEditDialogFragment) aCListenerS7S0200001_31.l0;
        int height = 0;
        spotlightImageEditDialogFragment2.LLLFF = false;
        C1840250xzL c1840250xzLVR = spotlightImageEditDialogFragment2.VR();
        if (c1840250xzLVR != null) {
            c1840250xzLVR.LIZIZ();
        }
        C1840250xzL c1840250xzLVR2 = ((SpotlightImageEditDialogFragment) aCListenerS7S0200001_31.l0).VR();
        if (c1840250xzLVR2 != null) {
            HandlerHook.viewPostDelay(c1840250xzLVR2, new ARunnableS131S0100000_31((SpotlightImageEditDialogFragment) aCListenerS7S0200001_31.l0, 71), Mp4ScreenVideoLoadTimeout.CONTROL);
        }
        ((SpotlightImageEditDialogFragment) aCListenerS7S0200001_31.l0).SR().LJII();
        SpotlightImageEditDialogFragment spotlightImageEditDialogFragment3 = (SpotlightImageEditDialogFragment) aCListenerS7S0200001_31.l0;
        spotlightImageEditDialogFragment3.LLJJIJI = BitmapUtils.rotateBitmap(spotlightImageEditDialogFragment3.LLJJIJI, 90);
        ((SpotlightImageEditDialogFragment) aCListenerS7S0200001_31.l0).SR().setImageBitmap(((SpotlightImageEditDialogFragment) aCListenerS7S0200001_31.l0).LLJJIJI);
        Bitmap bitmap = ((SpotlightImageEditDialogFragment) aCListenerS7S0200001_31.l0).LLJJIJI;
        if (bitmap != null) {
            width = bitmap.getWidth();
        } else {
            width = 0;
        }
        Bitmap bitmap2 = ((SpotlightImageEditDialogFragment) aCListenerS7S0200001_31.l0).LLJJIJI;
        if (bitmap2 != null) {
            height = bitmap2.getHeight();
        }
        AnonymousClass1677 anonymousClass1677 = ((SpotlightImageEditDialogFragment) aCListenerS7S0200001_31.l0).LLJJIII;
        if (anonymousClass1677 != null && (enumC1782750wUb = anonymousClass1677.LIZIZ) != null) {
            i = C1782800wUg.LIZ[enumC1782750wUb.ordinal()];
        } else {
            i = -1;
        }
        if (i != 1) {
            if (i != 2) {
                SpotlightImageEditDialogFragment spotlightImageEditDialogFragment4 = (SpotlightImageEditDialogFragment) aCListenerS7S0200001_31.l0;
                if (spotlightImageEditDialogFragment4.LLJJIJI != null && height < width && height > 0 && spotlightImageEditDialogFragment4.LLJLLL > 0) {
                    C21513519Hh c21513519HhSR = spotlightImageEditDialogFragment4.SR();
                    if (c21513519HhSR != null) {
                        c21513519HhSR.LJIIIZ(new PointF(500.0f, 1000.0f), 1.0E-4f, 600.0f, new PointF(200.0f, 500.0f));
                    }
                    C21513519Hh c21513519HhSR2 = ((SpotlightImageEditDialogFragment) aCListenerS7S0200001_31.l0).SR();
                    if (c21513519HhSR2 != null) {
                        c21513519HhSR2.LJIIJJI(1L);
                    }
                    C21513519Hh c21513519HhSR3 = ((SpotlightImageEditDialogFragment) aCListenerS7S0200001_31.l0).SR();
                    if (c21513519HhSR3 != null) {
                        HandlerHook.viewPostDelay(c21513519HhSR3, new ARunnableS100S0200000_31((SpotlightImageEditDialogFragment) aCListenerS7S0200001_31.l0, (C817403Hg) aCListenerS7S0200001_31.l1, 25), 50L);
                    }
                }
            } else {
                SpotlightImageEditDialogFragment spotlightImageEditDialogFragment5 = (SpotlightImageEditDialogFragment) aCListenerS7S0200001_31.l0;
                if (spotlightImageEditDialogFragment5.LLJJIJI != null && height < width && height > 0 && spotlightImageEditDialogFragment5.LLJLLL > 0) {
                    C21513519Hh c21513519HhSR4 = spotlightImageEditDialogFragment5.SR();
                    if (c21513519HhSR4 != null) {
                        c21513519HhSR4.LJIIIZ(new PointF(500.0f, 1000.0f), 1.0E-4f, 600.0f, new PointF(200.0f, 500.0f));
                    }
                    C21513519Hh c21513519HhSR5 = ((SpotlightImageEditDialogFragment) aCListenerS7S0200001_31.l0).SR();
                    if (c21513519HhSR5 != null) {
                        c21513519HhSR5.LJIIJJI(1L);
                    }
                    C21513519Hh c21513519HhSR6 = ((SpotlightImageEditDialogFragment) aCListenerS7S0200001_31.l0).SR();
                    if (c21513519HhSR6 != null) {
                        HandlerHook.viewPostDelay(c21513519HhSR6, new ARunnableS100S0200000_31((SpotlightImageEditDialogFragment) aCListenerS7S0200001_31.l0, (C817403Hg) aCListenerS7S0200001_31.l1, 24), 50L);
                    }
                } else {
                    C21513519Hh c21513519HhSR7 = spotlightImageEditDialogFragment5.SR();
                    if (c21513519HhSR7 != null) {
                        c21513519HhSR7.LJIIIZ(new PointF(0.0f, aCListenerS7S0200001_31.f2), 1.0f, 1.0f, new PointF(0.0f, 0.0f));
                    }
                    C21513519Hh c21513519HhSR8 = ((SpotlightImageEditDialogFragment) aCListenerS7S0200001_31.l0).SR();
                    if (c21513519HhSR8 != null) {
                        c21513519HhSR8.LJIIJJI(null);
                    }
                }
            }
        } else {
            C21513519Hh c21513519HhSR9 = ((SpotlightImageEditDialogFragment) aCListenerS7S0200001_31.l0).SR();
            if (c21513519HhSR9 != null) {
                c21513519HhSR9.LJIIIZ(new PointF(500.0f, 1000.0f), 1.0E-4f, 600.0f, new PointF(200.0f, 500.0f));
            }
            C21513519Hh c21513519HhSR10 = ((SpotlightImageEditDialogFragment) aCListenerS7S0200001_31.l0).SR();
            if (c21513519HhSR10 != null) {
                c21513519HhSR10.LJIIJJI(1L);
            }
        }
        C21513519Hh c21513519HhSR11 = ((SpotlightImageEditDialogFragment) aCListenerS7S0200001_31.l0).SR();
        if (c21513519HhSR11 != null) {
            HandlerHook.viewPostDelay(c21513519HhSR11, new ARunnableS131S0100000_31((SpotlightImageEditDialogFragment) aCListenerS7S0200001_31.l0, 72), 100L);
        }
    }

    public ACListenerS7S0200001_31(Object obj, float f, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.f2 = f;
        this.l1 = obj2;
    }
}
