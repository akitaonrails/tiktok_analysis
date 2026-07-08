package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.skeleton.TuxSkeletonLayout;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.music.v2.assem.MusicDraftAssem;
import com.ss.android.ugc.aweme.services.effect.IEffectService;
import com.ss.android.ugc.aweme.services.external.IAVDraftService;
import com.ss.android.ugc.aweme.shortvideo.model.VideoCoverConfig;
import com.zhiliaoapp.musically.R;
import irm.AkS30S0300000_22;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS24S0010000_9;
import njp.a;

/* JADX INFO: renamed from: X.0mwp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.aweme.music.v2.assem.MusicDraftAssem$initData$1$1$1$itemsDeferred$1$1", f = "MusicDraftAssem.kt", l = {}, m = "invokeSuspend")
public final class C1415850mwp extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ List<AwemeDraft> LL;
    public final /* synthetic */ MusicDraftAssem LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1415850mwp(List<AwemeDraft> list, MusicDraftAssem musicDraftAssem, boolean z, InterfaceC1364105Vn<? super C1415850mwp> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = list;
        this.LLILLJJLI = musicDraftAssem;
        this.LLILLL = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1415850mwp(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String quantityString;
        MusicDraftAssem musicDraftAssem;
        C1415860mwq c1415860mwq;
        C1C7U.LIZ("MusicDraftAssem@abb.initData$1$1$1$itemsDeferred$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        List<AwemeDraft> list = this.LL;
        if (list != null) {
            final MusicDraftAssem musicDraftAssem2 = this.LLILLJJLI;
            final boolean z = this.LLILLL;
            musicDraftAssem2.getClass();
            if (list.isEmpty()) {
                musicDraftAssem2.mp().setState(new AwS24S0010000_9(false, 21));
            } else {
                final AwemeDraft awemeDraft = (AwemeDraft) ListProtector.get(list, 0);
                if (awemeDraft != null) {
                    AwemeDraft awemeDraft2 = (AwemeDraft) C13LP.LJJJLZIJ(1, list);
                    IAVDraftService iAVDraftService = (IAVDraftService) musicDraftAssem2.LLJJIJIL.getValue();
                    if (iAVDraftService != null) {
                        quantityString = iAVDraftService.getSaveDate(awemeDraft);
                    } else {
                        quantityString = null;
                    }
                    TextView textView = (TextView) musicDraftAssem2.LLJJJJ.getValue();
                    if (textView != null) {
                        C1415860mwq c1415860mwq2 = musicDraftAssem2.LLJLLIL;
                        if (c1415860mwq2 != null) {
                            if (quantityString == null) {
                                quantityString = "";
                            } else if (c1415860mwq2.LIZ > 1) {
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append(quantityString);
                                sbLIZ.append(" and ");
                                sbLIZ.append(c1415860mwq2.LIZ - 1);
                                sbLIZ.append(" other");
                                C2188811AlT.LIZIZ(sbLIZ);
                                int i = c1415860mwq2.LIZ - 1;
                                quantityString = c1415860mwq2.LIZIZ.getResources().getQuantityString(2131755715, i, quantityString, Integer.valueOf(i));
                            }
                        } else {
                            quantityString = null;
                        }
                        textView.setText(quantityString);
                    }
                    AbstractC20628015ni abstractC20628015ni = (AbstractC20628015ni) musicDraftAssem2.LLJL.getValue();
                    if (abstractC20628015ni != null) {
                        abstractC20628015ni.setLoading(false);
                    }
                    final VideoCoverConfig videoCoverConfig = new VideoCoverConfig(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(42)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(56)), Bitmap.Config.ARGB_8888);
                    C0MZ9.LJIIIZ(awemeDraft, videoCoverConfig, new IEffectService.OnVideoCoverCallback() { // from class: X.0mwn
                        @Override // com.ss.android.ugc.aweme.services.effect.IEffectService.OnVideoCoverCallback
                        public final void onGetVideoCoverFailed(int i2) {
                        }

                        @Override // com.ss.android.ugc.aweme.services.effect.IEffectService.OnVideoCoverCallback
                        public final void onGetVideoCoverSuccess(Bitmap bitmap) {
                            Resources resources;
                            try {
                                TuxSkeletonLayout tuxSkeletonLayout = (TuxSkeletonLayout) musicDraftAssem2.LLJJLIIIJLLLLLLLZ.getValue();
                                if (tuxSkeletonLayout != null) {
                                    tuxSkeletonLayout.setLoading(false);
                                }
                                View view = (View) musicDraftAssem2.LLJJJJJIL.getValue();
                                if (view != null) {
                                    C786410Ut5.LJLLLLLL(0, view);
                                }
                                Context context = musicDraftAssem2.getContext();
                                if (context != null && (resources = context.getResources()) != null) {
                                    float dimension = resources.getDimension(R.dimen.b6);
                                    C0FRO c0fro = (C0FRO) musicDraftAssem2.LLJJJJLIIL.getValue();
                                    if (c0fro != null) {
                                        c0fro.setRadius(dimension);
                                    }
                                }
                                C0FRO c0fro2 = (C0FRO) musicDraftAssem2.LLJJJJLIIL.getValue();
                                if (c0fro2 != null) {
                                    c0fro2.setImageBitmap(bitmap);
                                }
                                if (z) {
                                    InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) musicDraftAssem2.LLJJJ.getValue();
                                    C1DFH c1dfh = C0PEM.LIZ;
                                    C23250099c.LIZLLL(interfaceC497601wk, C2107308Nj.LIZ, null, new C1411070mp7(awemeDraft, videoCoverConfig, musicDraftAssem2, null), 2);
                                }
                            } catch (RuntimeException e) {
                                TryCatchGuardChecker.doCheck(e);
                            }
                        }
                    });
                    if (awemeDraft2 == null) {
                        AppCompatImageView appCompatImageView = (AppCompatImageView) musicDraftAssem2.LLJJL.getValue();
                        if (appCompatImageView != null) {
                            appCompatImageView.setImageBitmap(null);
                        }
                        ImageView imageView = (ImageView) musicDraftAssem2.LLJJL.getValue();
                        if (imageView != null) {
                            int visibility = imageView.getVisibility();
                            imageView.setVisibility(8);
                            C1602160rnK.LIZIZ(visibility, 8, imageView);
                        }
                    } else {
                        C0MZ9.LJIIIZ(awemeDraft2, new VideoCoverConfig(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48)), Bitmap.Config.ARGB_8888), new IEffectService.OnVideoCoverCallback() { // from class: X.0mwo
                            @Override // com.ss.android.ugc.aweme.services.effect.IEffectService.OnVideoCoverCallback
                            public final void onGetVideoCoverFailed(int i2) {
                            }

                            @Override // com.ss.android.ugc.aweme.services.effect.IEffectService.OnVideoCoverCallback
                            public final void onGetVideoCoverSuccess(Bitmap bitmap) {
                                Resources resources;
                                try {
                                    Context context = musicDraftAssem2.getContext();
                                    if (context != null && (resources = context.getResources()) != null) {
                                        float dimension = resources.getDimension(R.dimen.b6);
                                        C0FRO c0fro = (C0FRO) musicDraftAssem2.LLJJL.getValue();
                                        if (c0fro != null) {
                                            c0fro.setRadius(dimension);
                                        }
                                    }
                                    C0FRO c0fro2 = (C0FRO) musicDraftAssem2.LLJJL.getValue();
                                    if (c0fro2 != null) {
                                        c0fro2.setImageBitmap(bitmap);
                                    }
                                    C0FRO c0fro3 = (C0FRO) musicDraftAssem2.LLJJL.getValue();
                                    if (c0fro3 != null) {
                                        int visibility2 = c0fro3.getVisibility();
                                        c0fro3.setVisibility(0);
                                        C1602160rnK.LIZIZ(visibility2, 0, c0fro3);
                                    }
                                } catch (RuntimeException e) {
                                    TryCatchGuardChecker.doCheck(e);
                                }
                            }
                        });
                    }
                }
            }
            AwemeDraft awemeDraft3 = (AwemeDraft) C13LP.LJJJLL(this.LL);
            if (awemeDraft3 != null && (c1415860mwq = (musicDraftAssem = this.LLILLJJLI).LLJLLIL) != null) {
                int i2 = C1415890mwt.LIZ[c1415860mwq.LIZ().ordinal()];
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 == 3) {
                            View contentView = musicDraftAssem.getContentView();
                            C786410Ut5.I7(new AkS30S0300000_22(musicDraftAssem, c1415860mwq, contentView, 3), contentView);
                            FrameLayout frameLayoutLp = musicDraftAssem.lp();
                            if (frameLayoutLp != null) {
                                C786410Ut5.I7(new AkS30S0300000_22(musicDraftAssem, c1415860mwq, awemeDraft3, 4), frameLayoutLp);
                            }
                        } else {
                            throw new C1954807lC();
                        }
                    } else {
                        View contentView2 = musicDraftAssem.getContentView();
                        C786410Ut5.I7(new AkS30S0300000_22(musicDraftAssem, c1415860mwq, contentView2, 7), contentView2);
                        FrameLayout frameLayoutLp2 = musicDraftAssem.lp();
                        if (frameLayoutLp2 != null) {
                            C786410Ut5.I7(new AkS30S0300000_22(musicDraftAssem, c1415860mwq, frameLayoutLp2, 8), frameLayoutLp2);
                        }
                    }
                } else {
                    C786410Ut5.I7(new AkS30S0300000_22(musicDraftAssem, c1415860mwq, awemeDraft3, 5), musicDraftAssem.getContentView());
                    FrameLayout frameLayoutLp3 = musicDraftAssem.lp();
                    if (frameLayoutLp3 != null) {
                        C786410Ut5.I7(new AkS30S0300000_22(musicDraftAssem, c1415860mwq, awemeDraft3, 6), frameLayoutLp3);
                    }
                }
            }
        }
        this.LLILLJJLI.mp().setState(new AwS24S0010000_9(false, 22));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MusicDraftAssem@abb.initData$1$1$1$itemsDeferred$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
