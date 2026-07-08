package X;

import Y.ARunnableS105S0100000_5;
import Y.ARunnableS106S0100000_6;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.tools.chat.common.save.IAiChatFileService;
import com.ss.android.ugc.tools.data.GuideAppearance;
import com.ss.android.ugc.tools.data.RawIcon;
import com.ss.ttvideoengine.TTVideoEngine;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS576S0100000_32;
import kotlin.jvm.internal.AwS86S0500000_32;
import kotlin.text.u;
import wh6.AbS711S0100000_32;

/* JADX INFO: renamed from: X.18XX, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18XX extends Scene {
    public final Function0<Unit> LLJI;
    public final Function0<Unit> LLJIJIL;
    public final GuideAppearance LLJILJIL;
    public final String LLJILJILJ;
    public final C01GW LLJILLL = C452501pT.LIZIZ(new AwS576S0100000_32(this, 564));
    public final C01GW LLJJ = C452501pT.LIZIZ(new AwS576S0100000_32(this, 565));
    public final C01GW LLJJI = C452501pT.LIZIZ(new AwS576S0100000_32(this, 566));
    public final C01GW LLJJIII = C452501pT.LIZIZ(new AwS576S0100000_32(this, 563));
    public final C01GW LLJJIJI = C452501pT.LIZIZ(new AwS576S0100000_32(this, 562));
    public final C01GW LLJJIJIIJIL = C452501pT.LIZIZ(new AwS576S0100000_32(this, 561));
    public final C01GW LLJJIJIL = C452501pT.LIZIZ(new AwS576S0100000_32(this, 567));

    public final C1322110kVd LLLII() {
        return (C1322110kVd) this.LLJJIJIIJIL.getValue();
    }

    public final TextureView LLLIIIIL() {
        return (TextureView) this.LLJJIJI.getValue();
    }

    public final TTVideoEngine LLLIILIL() {
        return (TTVideoEngine) this.LLJJIJIL.getValue();
    }

    @Override // com.bytedance.scene.Scene
    public final void onDestroyView() {
        super.onDestroyView();
        LLLIILIL().release();
    }

    @Override // com.bytedance.scene.Scene
    public final void onPause() {
        super.onPause();
        if (LLLIILIL().LJJLIIIJILLIZJL() == 1) {
            LLLIILIL().pause();
        }
    }

    @Override // com.bytedance.scene.Scene
    public final void onResume() {
        super.onResume();
        if (LLLIILIL().LJJZZIII() && LLLIILIL().LJJLIIIJILLIZJL() == 2) {
            LLLIILIL().play();
        }
    }

    /* JADX WARN: Type inference failed for: r3v12, types: [REQUEST, X.0kbR, java.lang.Object] */
    @Override // com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        String str;
        String str2;
        Uri uriLJIILJJIL;
        ViewGroup.LayoutParams layoutParams;
        InterfaceC332260D0u interfaceC332260D0uOo;
        ViewGroup.LayoutParams layoutParams2;
        Integer numValueOf;
        int iIntValue;
        int iIntValue2;
        int iIntValue3;
        int iIntValue4;
        super.onActivityCreated(bundle);
        View view = this.mView;
        view.setOutlineProvider(new C0IDA(32.0f, 18));
        view.setClipToOutline(true);
        TextView textView = (TextView) this.LLJILLL.getValue();
        if (textView != null) {
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(200));
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.a03);
            textView.setBackground(c384050F3z.LIZ(textView.getContext()));
            textView.setText(C21291518Tx.LJ(EnumC21291418Tw.PRIVACY_LEAVE_BUTTON_TEXT, new Object[0]));
        }
        TextView textView2 = (TextView) this.LLJJ.getValue();
        if (textView2 != null) {
            int[] iArr = new int[3];
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.cq, textView2.getContext());
            if (numLIZJ != null) {
                iIntValue2 = numLIZJ.intValue();
            } else {
                iIntValue2 = 0;
            }
            iArr[0] = iIntValue2;
            Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.cc, textView2.getContext());
            if (numLIZJ2 != null) {
                iIntValue3 = numLIZJ2.intValue();
            } else {
                iIntValue3 = 0;
            }
            iArr[1] = iIntValue3;
            Integer numLIZJ3 = C1308910kAL.LIZJ(R.attr.ce, textView2.getContext());
            if (numLIZJ3 != null) {
                iIntValue4 = numLIZJ3.intValue();
            } else {
                iIntValue4 = 0;
            }
            iArr[2] = iIntValue4;
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius(C418440Gaw.LIZIZ(200));
            gradientDrawable.setColors(iArr);
            gradientDrawable.setOrientation(GradientDrawable.Orientation.BL_TR);
            textView2.setBackground(gradientDrawable);
            textView2.setText(C21291518Tx.LJ(EnumC21291418Tw.PRIVACY_START_BUTTON_TEXT, new Object[0]));
        }
        TextView textView3 = (TextView) this.LLJJI.getValue();
        if (textView3 != null) {
            GuideAppearance guideAppearance = this.LLJILJIL;
            if (guideAppearance != null) {
                numValueOf = Integer.valueOf(guideAppearance.subTitleResId);
            } else {
                numValueOf = null;
            }
            C21291618Ty c21291618Ty = EnumC21291418Tw.Companion;
            if (numValueOf != null) {
                iIntValue = numValueOf.intValue();
            } else {
                iIntValue = 2131825539;
            }
            c21291618Ty.getClass();
            textView3.setText(C21291518Tx.LJ(C21291618Ty.LIZ(iIntValue), new Object[0]));
        }
        Context contextRequireSceneContext = requireSceneContext();
        GuideAppearance guideAppearance2 = this.LLJILJIL;
        if (guideAppearance2 != null) {
            RawIcon rawIcon = guideAppearance2.brandIcon;
        }
        TextView textView4 = (TextView) this.LLJJIII.getValue();
        if (textView4 != null) {
            textView4.setMovementMethod(LinkMovementMethod.getInstance());
            textView4.setText(C432070Gwv.LIZLLL(contextRequireSceneContext, C21291518Tx.LJ(EnumC21291418Tw.PRIVACY_GUIDE_DESC, new Object[0])));
        }
        Map<String, String> map = C21288518St.LIZ().guideImageUrls;
        if (map != null) {
            str = map.get(this.LLJILJILJ);
        } else {
            str = null;
        }
        Map<String, String> map2 = C21288518St.LIZ().guideVideoUrls;
        if (map2 != null) {
            str2 = map2.get(this.LLJILJILJ);
        } else {
            str2 = null;
        }
        if (str == null && str2 == null) {
            str2 = C21288518St.LIZ().guideVideoUrl;
        }
        if (str2 != null) {
            TextureView textureViewLLLIIIIL = LLLIIIIL();
            if (textureViewLLLIIIIL != null) {
                C786410Ut5.LLIIIILZ(textureViewLLLIIIIL, 0);
            }
            C1322110kVd c1322110kVdLLLII = LLLII();
            if (c1322110kVdLLLII != null) {
                C786410Ut5.LLZZLLIL(c1322110kVdLLLII, 8);
            }
            LLLIILIL().LLILZIL("AiChatGuideDialogScene");
            LLLIILIL().setLooping(true);
            LLLIILIL().LIZJ(199, 1);
            LLLIILIL().LIZJ(4, 2);
            TextureView textureViewLLLIIIIL2 = LLLIIIIL();
            if (textureViewLLLIIIIL2 != null && (layoutParams2 = textureViewLLLIIIIL2.getLayoutParams()) != null) {
                layoutParams2.height = Resources.getSystem().getDisplayMetrics().widthPixels;
            }
            TextureView textureViewLLLIIIIL3 = LLLIIIIL();
            if (textureViewLLLIIIIL3 != null && textureViewLLLIIIIL3.getParent() != null) {
                HandlerHook.viewPost(textureViewLLLIIIIL3, new ARunnableS105S0100000_5(textureViewLLLIIIIL3, 104));
            } else {
                C21290818Tq.LIZIZ("AiChatGuideDialogScene", "backgroundTextureView's parent is null", null);
            }
            IAiChatFileService iAiChatFileService = (IAiChatFileService) PluggableExtentionKt.pluggableSpi$default(IAiChatFileService.class, false, false, false, 14, null);
            if (iAiChatFileService != null && (interfaceC332260D0uOo = iAiChatFileService.oo(str2, ".mp4", 3)) != null) {
                C09IC.LJJI(LifecycleOwnerKt.getLifecycleScope(this), new C861640Xr8(new C18XY(this, null), interfaceC332260D0uOo));
            }
        } else {
            TextureView textureViewLLLIIIIL4 = LLLIIIIL();
            if (textureViewLLLIIIIL4 != null) {
                C786410Ut5.LLIIIILZ(textureViewLLLIIIIL4, 8);
            }
            C1322110kVd c1322110kVdLLLII2 = LLLII();
            if (c1322110kVdLLLII2 != null) {
                C786410Ut5.LLZZLLIL(c1322110kVdLLLII2, 0);
            }
            if (str != null) {
                if (u.LJJIIJZLJL(str, "file://", false)) {
                    String path = UriProtector.parse(str).getPath();
                    if (path != null) {
                        str = path;
                    }
                    uriLJIILJJIL = C2471909mP.LJIILJJIL(str);
                } else {
                    uriLJIILJJIL = UriProtector.parse(str);
                }
                C1322110kVd c1322110kVdLLLII3 = LLLII();
                if (c1322110kVdLLLII3 != null && (layoutParams = c1322110kVdLLLII3.getLayoutParams()) != null) {
                    layoutParams.height = Resources.getSystem().getDisplayMetrics().widthPixels;
                }
                C1322110kVd c1322110kVdLLLII4 = LLLII();
                if (c1322110kVdLLLII4 != null) {
                    HandlerHook.viewPost(c1322110kVdLLLII4, new ARunnableS106S0100000_6(this, 198));
                }
                C1322110kVd c1322110kVdLLLII5 = LLLII();
                if (c1322110kVdLLLII5 != null) {
                    ?? LIZ = C1325700kbQ.LIZLLL(uriLJIILJJIL).LIZ();
                    C1320810kTX c1320810kTXLIZJ = C1322200kVm.LIZJ();
                    c1320810kTXLIZJ.LIZLLL = LIZ;
                    c1320810kTXLIZJ.LJIIIIZZ = new C12Z2(LIZ, 4);
                    c1322110kVdLLLII5.setController(c1320810kTXLIZJ.LIZ());
                }
            }
        }
        View view2 = (View) this.LLJILLL.getValue();
        if (view2 != null) {
            C786410Ut5.I7(new AbS711S0100000_32(this, 1), view2);
        }
        View view3 = (View) this.LLJJ.getValue();
        if (view3 != null) {
            C786410Ut5.I7(new AbS711S0100000_32(this, 2), view3);
        }
    }

    @Override // com.bytedance.scene.Scene
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
    }

    @Override // com.bytedance.scene.Scene
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        setTheme(R.style.y0);
        C432070Gwv.LJ((C19EG) requireActivity());
        return C786410Ut5.Td(layoutInflater, R.layout.bg4, viewGroup, false);
    }

    public C18XX(AwS86S0500000_32 awS86S0500000_32, AwS86S0500000_32 awS86S0500000_322, GuideAppearance guideAppearance, String str) {
        this.LLJI = awS86S0500000_32;
        this.LLJIJIL = awS86S0500000_322;
        this.LLJILJIL = guideAppearance;
        this.LLJILJILJ = str;
    }
}
