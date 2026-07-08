package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.widget.RadiusLayout;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImage;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS189S0000000_3;
import kotlin.jvm.internal.AwS153S0101000_13;
import kotlin.jvm.internal.AwS577S0100000_33;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.19va, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21696019va extends FrameLayout {
    public int LL;
    public final boolean LLILLJJLI;
    public final C01GW LLILLL;
    public final C01GW LLILZ;
    public ViewStub LLILZIL;
    public C16FP LLILZLL;
    public final C01GW LLIZ;
    public final C01GW LLIZLLLIL;
    public final C01GW LLJ;
    public final C01GW LLJI;
    public C725850Sdb LLJIJIL;
    public boolean LLJILJIL;
    public final C01GW LLJILJILJ;
    public final C01GW LLJILLL;
    public Aweme LLJJ;
    public long LLJJI;
    public C21696319vd LLJJIII;
    public final C21696119vb LLJJIJI;
    public final C2189771An1 LLJJIJIIJIL;

    public C21696019va(Context context) {
        this(30, context, null);
    }

    public C21696019va(Context context, AttributeSet attributeSet) {
        this(28, context, attributeSet);
    }

    private final TuxIconView getLivePhotoIcon() {
        return (TuxIconView) this.LLIZ.getValue();
    }

    private final FrameLayout getPhotoTagView() {
        return (FrameLayout) this.LLIZLLLIL.getValue();
    }

    private final RadiusLayout getPhotoViewLayout() {
        return (RadiusLayout) this.LLILLL.getValue();
    }

    private final RadiusLayout getStoryTag() {
        return (RadiusLayout) this.LLJI.getValue();
    }

    public final void LIZIZ() {
        Drawable drawableLIZ;
        if (this.LL == 0) {
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZLLL = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(0.5d))));
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.a03);
            c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(8));
            c384050F3z.LJFF = Integer.valueOf(R.attr.a02);
            drawableLIZ = c384050F3z.LIZ(getContext());
        } else {
            drawableLIZ = null;
        }
        setBackground(drawableLIZ);
    }

    public final TuxTextView getDebugTextView() {
        return (TuxTextView) this.LLJILJILJ.getValue();
    }

    public final SmartImageView getImgView() {
        return (SmartImageView) this.LLILZ.getValue();
    }

    public final Map<String, String> getMap() {
        return (Map) this.LLJILLL.getValue();
    }

    public final String getOutputText() {
        StringBuilder sb = new StringBuilder();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("size(w x h):\n ");
        sbLIZ.append(getMap().get("img_size"));
        sbLIZ.append('\n');
        sb.append(C2188811AlT.LIZIZ(sbLIZ));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("container (w x h):\n ");
        sbLIZ2.append(getMap().get("container_size"));
        sbLIZ2.append('\n');
        sb.append(C2188811AlT.LIZIZ(sbLIZ2));
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("duration: ");
        sbLIZ3.append(getMap().get("duration"));
        sbLIZ3.append('\n');
        sb.append(C2188811AlT.LIZIZ(sbLIZ3));
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("source: ");
        sbLIZ4.append(getMap().get("source"));
        sbLIZ4.append('\n');
        sb.append(C2188811AlT.LIZIZ(sbLIZ4));
        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
        sbLIZ5.append("position: ");
        C21696319vd c21696319vd = this.LLJJIII;
        sbLIZ5.append(c21696319vd != null ? Integer.valueOf(c21696319vd.LIZJ) : null);
        sbLIZ5.append('\n');
        sb.append(C2188811AlT.LIZIZ(sbLIZ5));
        StringBuilder sbLIZ6 = C2188811AlT.LIZ();
        sbLIZ6.append("aweme_id, ");
        Aweme aweme = this.LLJJ;
        sbLIZ6.append(aweme != null ? aweme.getAid() : null);
        sbLIZ6.append('\n');
        sb.append(C2188811AlT.LIZIZ(sbLIZ6));
        return sb.toString();
    }

    public final TuxTextView getPhotoCountView() {
        return (TuxTextView) this.LLJ.getValue();
    }

    public final InterfaceC427850Gq7 getImageDisplayListener() {
        return this.LLJJIJIIJIL;
    }

    public final InterfaceC658750Psf getMonitorListener() {
        return this.LLJJIJI;
    }

    public final void LIZ(boolean z) {
        FrameLayout.LayoutParams layoutParams;
        int i;
        C16FP c16fp = this.LLILZLL;
        if (c16fp != null) {
            ViewGroup.LayoutParams layoutParams2 = getImgView().getLayoutParams();
            FrameLayout.LayoutParams layoutParams3 = null;
            if ((layoutParams2 instanceof FrameLayout.LayoutParams) && (layoutParams = (FrameLayout.LayoutParams) layoutParams2) != null) {
                if (z) {
                    i = 8388611;
                } else {
                    i = 17;
                }
                layoutParams.gravity = i;
                layoutParams3 = layoutParams;
            }
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c16fp);
            c16fp.setLayoutParams(layoutParams3);
        }
    }

    public final void setPhotoStyle(int i) {
        if (this.LL == i) {
            return;
        }
        this.LL = i;
        LIZIZ();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r0v28, types: [X.19vb] */
    public C21696019va(int i, Context context, AttributeSet attributeSet) {
        boolean z;
        int i2;
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        if ((i & 16) != 0) {
            z = true;
        } else {
            z = false;
        }
        super(context, attributeSet, 0);
        this.LL = 0;
        this.LLILLJJLI = z;
        if (C142800gc.LIZ()) {
            i2 = R.layout.cbl;
        } else {
            i2 = R.layout.cbk;
        }
        if (C1261804wi.LIZ()) {
            C705700RmC.LIZIZ(context, i2, this, true, true, 4);
        } else {
            FrameLayout.inflate(context, i2, this);
        }
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.FriendsV3SinglePhotoView);
            this.LL = typedArrayObtainStyledAttributes.getInt(R$styleable.FriendsV3SinglePhotoView_photoStyle, this.LL);
            this.LLILLJJLI = typedArrayObtainStyledAttributes.getBoolean(R$styleable.FriendsV3SinglePhotoView_showRetry, z);
            typedArrayObtainStyledAttributes.recycle();
        }
        RadiusLayout radiusLayout = (RadiusLayout) findViewById(R.id.qe8);
        if (radiusLayout != null) {
            radiusLayout.setRadius(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10)));
        }
        RadiusLayout radiusLayout2 = (RadiusLayout) findViewById(R.id.ke_);
        if (radiusLayout2 != null) {
            radiusLayout2.setRadius(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)));
        }
        RadiusLayout radiusLayout3 = (RadiusLayout) findViewById(R.id.imu);
        if (radiusLayout3 != null) {
            radiusLayout3.setRadius(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)));
        }
        if (C142800gc.LIZ()) {
            this.LLILZIL = (ViewStub) findViewById(R.id.qdr);
        } else {
            this.LLILZLL = (C16FP) findViewById(R.id.qds);
        }
        LIZIZ();
        this.LLILLL = C452501pT.LIZIZ(new AwS577S0100000_33(this, 3867));
        this.LLILZ = C452501pT.LIZIZ(new AwS577S0100000_33(this, 3863));
        this.LLIZ = C452501pT.LIZIZ(new AwS577S0100000_33(this, 3864));
        this.LLIZLLLIL = C452501pT.LIZIZ(new AwS577S0100000_33(this, 3866));
        this.LLJ = C452501pT.LIZIZ(new AwS577S0100000_33(this, 3865));
        this.LLJI = C452501pT.LIZIZ(new AwS577S0100000_33(this, 3868));
        this.LLJILJILJ = C452501pT.LIZIZ(new AwS577S0100000_33(this, 3862));
        this.LLJILLL = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(994));
        this.LLJJIJI = new InterfaceC658750Psf() { // from class: X.19vb
            @Override // X.InterfaceC658750Psf
            public final void Ck(JSONObject jSONObject) {
                boolean z2;
                boolean z3;
                String str;
                int i3;
                int iLIZ;
                String aid;
                if (jSONObject.optInt("from") == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                String strOptString = jSONObject.optString("image_type");
                if (jSONObject.optInt("heic_sys_first") == 1) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                int iOptInt = jSONObject.optInt("from");
                if (iOptInt != 0) {
                    if (iOptInt != 1) {
                        if (iOptInt != 2) {
                            str = "unknown";
                        } else {
                            str = "disk";
                        }
                    } else {
                        str = "memory";
                    }
                } else {
                    str = "network";
                }
                String strOptString2 = jSONObject.optString("duration");
                if (C289030BUn.LIZ()) {
                    this.LL.getMap().put("duration", String.valueOf(strOptString2));
                    this.LL.getMap().put("source", str);
                    this.LL.getMap().put("is_heic", String.valueOf(strOptString));
                    this.LL.getDebugTextView().setText(this.LL.getOutputText());
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("imageMonitorData: ");
                sbLIZ.append(jSONObject);
                C2188811AlT.LIZIZ(sbLIZ);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("from: ");
                sbLIZ2.append(str);
                sbLIZ2.append(", duration: ");
                sbLIZ2.append(strOptString2);
                sbLIZ2.append("isImageFromNetwork: ");
                sbLIZ2.append(z2);
                sbLIZ2.append(", isHeicFormatSupport: ");
                sbLIZ2.append(strOptString);
                sbLIZ2.append(", isHeicHardDecoded: ");
                sbLIZ2.append(z3);
                C2188811AlT.LIZIZ(sbLIZ2);
                C21696519vf c21696519vf = C21696519vf.LIZ;
                String strValueOf = String.valueOf(str);
                String strValueOf2 = String.valueOf(strOptString);
                String strValueOf3 = String.valueOf(strOptString2);
                C21696019va c21696019va = this.LL;
                C21696319vd c21696319vd = c21696019va.LLJJIII;
                if (c21696319vd != null) {
                    i3 = c21696319vd.LIZJ;
                } else {
                    i3 = 0;
                }
                Aweme aweme = c21696019va.LLJJ;
                if (aweme != null) {
                    iLIZ = C0S7E.LIZ(aweme);
                } else {
                    iLIZ = 0;
                }
                Aweme aweme2 = this.LL.LLJJ;
                if (aweme2 == null || (aid = aweme2.getAid()) == null) {
                    aid = "";
                }
                boolean z4 = this.LL.LLJILJIL;
                c21696519vf.getClass();
                C109100bB c109100bB = C109100bB.LIZ;
                C13DA c13da = new C13DA();
                c13da.putAll(C2097608Jq.LJIIIIZZ(new Pair("from", strValueOf), new Pair("is_heic_format_support", strValueOf2), new Pair("is_heic_hard_decoded", Boolean.valueOf(z3)), new Pair("duration", strValueOf3), new Pair("is_image_from_network", Boolean.valueOf(z2)), new Pair("group_id", aid), new Pair("image_index", Integer.valueOf(i3)), new Pair("total_count", Integer.valueOf(iLIZ)), new Pair("is_from_retry", Boolean.valueOf(z4))));
                Map mapBuild = c13da.build();
                c109100bB.getClass();
                C109100bB.LIZ("ttsocial_friends_v3_image_load_success_tech", mapBuild);
            }

            @Override // X.InterfaceC658750Psf
            public final void onImageLoaded(boolean z2, String str, JSONObject jSONObject) {
                String aid;
                if (!z2) {
                    Aweme aweme = this.LL.LLJJ;
                    if (aweme != null) {
                        aid = aweme.getAid();
                    } else {
                        aid = null;
                    }
                    AbstractC19486711Lt.LJIIJJI(new C2325361G0o(aid, jSONObject, 1)).LJIJJLI(C11S5.LIZ()).LJIIIIZZ(new C516901zr(17)).LJIIZILJ();
                }
            }
        };
        this.LLJJIJIIJIL = new C2189771An1(this, 2);
    }

    public static void LIZJ(C21696019va c21696019va, PhotoModeImage photoModeImage, int i, Pair pair, Aweme aweme, ImageView.ScaleType scaleType, boolean z, LifecycleOwner lifecycleOwner, boolean z2, int i2, boolean z3, boolean z4, int i3) {
        FrameLayout.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        boolean z5;
        int i4;
        boolean z6;
        boolean z7;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean z8;
        int iLIZIZ;
        C725850Sdb c725850Sdb;
        int width;
        int marginEnd;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        C16FP c16fp;
        int i9;
        Integer numValueOf;
        Integer numValueOf2;
        Float f;
        FrameLayout.LayoutParams layoutParams3;
        int i10;
        int iLIZIZ2;
        int iLIZIZ3;
        boolean z9 = z3;
        int i11 = i2;
        boolean z10 = z2;
        if ((i3 & 128) != 0) {
            z10 = false;
        }
        if ((i3 & 256) != 0) {
            i11 = 0;
        }
        if ((i3 & 512) != 0) {
            z9 = false;
        }
        if ((i3 & 1024) != 0) {
            z4 = false;
        }
        c21696019va.getClass();
        if (C1206504nn.LIZ()) {
            ViewGroup.LayoutParams layoutParams4 = c21696019va.getPhotoTagView().getLayoutParams();
            if ((layoutParams4 instanceof FrameLayout.LayoutParams) && (layoutParams3 = (FrameLayout.LayoutParams) layoutParams4) != null) {
                FrameLayout photoTagView = c21696019va.getPhotoTagView();
                if (z4) {
                    i10 = 8388661;
                } else {
                    i10 = 8388659;
                }
                layoutParams3.gravity = i10;
                if (z4) {
                    iLIZIZ2 = 0;
                } else {
                    iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
                }
                layoutParams3.setMarginStart(iLIZIZ2);
                if (z4) {
                    iLIZIZ3 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
                } else {
                    iLIZIZ3 = 0;
                }
                layoutParams3.setMarginEnd(iLIZIZ3);
                C786410Ut5.a6(photoTagView, layoutParams3);
            }
        }
        c21696019va.LLJJIII = new C21696319vd(photoModeImage, pair, i, z9);
        c21696019va.LLJJI = System.currentTimeMillis();
        Aweme aweme2 = aweme;
        c21696019va.LLJJ = aweme2;
        int iIntValue = ((Number) pair.getFirst()).intValue();
        int iIntValue2 = ((Number) pair.getSecond()).intValue();
        if (C289030BUn.LIZ()) {
            Map<String, String> map = c21696019va.getMap();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            if (photoModeImage != null) {
                numValueOf = Integer.valueOf(photoModeImage.width);
            } else {
                numValueOf = null;
            }
            sbLIZ.append(numValueOf);
            sbLIZ.append(" x ");
            if (photoModeImage != null) {
                numValueOf2 = Integer.valueOf(photoModeImage.height);
            } else {
                numValueOf2 = null;
            }
            sbLIZ.append(numValueOf2);
            sbLIZ.append("\n ratio: ");
            if (photoModeImage != null) {
                f = photoModeImage.aspectRatio;
            } else {
                f = null;
            }
            sbLIZ.append(f);
            map.put("img_size", C2188811AlT.LIZIZ(sbLIZ));
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(iIntValue);
            sbLIZ2.append(" x ");
            sbLIZ2.append(iIntValue2);
            map.put("container_size", C2188811AlT.LIZIZ(sbLIZ2));
            map.put("img_scale_type", scaleType.toString());
        }
        SmartImageView imgView = c21696019va.getImgView();
        ViewGroup.LayoutParams layoutParams5 = c21696019va.getImgView().getLayoutParams();
        if ((layoutParams5 instanceof FrameLayout.LayoutParams) && (layoutParams = (FrameLayout.LayoutParams) layoutParams5) != null) {
            if (z9) {
                i9 = 8388611;
            } else {
                i9 = 17;
            }
            layoutParams.gravity = i9;
        } else {
            layoutParams = null;
        }
        C786410Ut5.G6(imgView, layoutParams);
        c21696019va.LIZ(z9);
        SmartImageView imgView2 = c21696019va.getImgView();
        ViewGroup.LayoutParams layoutParams6 = imgView2.getLayoutParams();
        if (layoutParams6 != null) {
            layoutParams6.width = iIntValue;
            layoutParams6.height = iIntValue2;
            C786410Ut5.W5(imgView2, layoutParams6);
        }
        c21696019va.getImgView().setScaleType(scaleType);
        if (C142800gc.LIZ()) {
            C16FP c16fp2 = c21696019va.LLILZLL;
            if (c16fp2 != null) {
                C786410Ut5.LJLLLLLL(8, c16fp2);
            }
        } else {
            C16FP c16fp3 = c21696019va.LLILZLL;
            if (c16fp3 != null) {
                c16fp3.LIZIZ(C16FR.LOADING);
            }
            C16FP c16fp4 = c21696019va.LLILZLL;
            if (c16fp4 != null && (layoutParams2 = c16fp4.getLayoutParams()) != null) {
                layoutParams2.width = iIntValue;
                layoutParams2.height = iIntValue2;
                C786410Ut5.W5(c16fp4, layoutParams2);
            }
        }
        SmartImageView imgView3 = c21696019va.getImgView();
        C21696119vb c21696119vb = c21696019va.LLJJIJI;
        Context context = c21696019va.getImgView().getContext();
        C2189771An1 c2189771An1 = c21696019va.LLJJIJIIJIL;
        if (c21696019va.LL == 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        C714800S2c.LJ(photoModeImage, imgView3, pair, aweme2, c21696119vb, context, i, c2189771An1, z5);
        if (C289030BUn.LIZ()) {
            c21696019va.getDebugTextView().setText(c21696019va.getOutputText());
            C786410Ut5.LLLLZLL(c21696019va.getDebugTextView(), 0);
        }
        boolean zLJJIJIL = C729510SjV.LJJIJIL(aweme2);
        if (zLJJIJIL) {
            i4 = 8;
            C786410Ut5.LLLLLLZZ(c21696019va.getLivePhotoIcon(), 8);
            C786410Ut5.LJZ(8, c21696019va.getPhotoTagView());
        } else {
            i4 = 8;
            if (C721220SQu.LJFF(i, aweme2)) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (C1206504nn.LIZ()) {
                if (z || (z4 && z10)) {
                    z7 = true;
                } else {
                    z7 = false;
                }
            } else {
                z7 = z10;
            }
            TuxIconView livePhotoIcon = c21696019va.getLivePhotoIcon();
            if (z6 && !z7) {
                i5 = 0;
            } else {
                i5 = 8;
            }
            C786410Ut5.LLLLLLZZ(livePhotoIcon, i5);
            C725890Sdf.LIZJ(c21696019va.getPhotoTagView(), z10, new AwS153S0101000_13(c21696019va, i11, 5));
        }
        RadiusLayout storyTag = c21696019va.getStoryTag();
        if (zLJJIJIL) {
            i6 = 0;
        } else {
            i6 = 8;
        }
        C786410Ut5.LLZZ(storyTag, i6);
        if (!C142800gc.LIZ() && (c16fp = c21696019va.LLILZLL) != null) {
            i7 = 0;
            i8 = 1;
            aweme2 = aweme2;
            c16fp.LIZ(new C21696219vc(c21696019va, photoModeImage, pair, aweme2, i));
        } else {
            i7 = 0;
            i8 = 1;
        }
        if (c21696019va.LL == i8) {
            c21696019va.getPhotoViewLayout().setRadius(0.0f);
        }
        if (z10 && !zLJJIJIL) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (C1206504nn.LIZ() && z8 && c21696019va.getPhotoTagView().getVisibility() == 0) {
            c21696019va.getPhotoTagView().measure(View.MeasureSpec.makeMeasureSpec(i7, i7), View.MeasureSpec.makeMeasureSpec(i7, i7));
            Integer numValueOf3 = Integer.valueOf(c21696019va.getPhotoTagView().getMeasuredWidth());
            if (numValueOf3.intValue() > 0) {
                width = numValueOf3.intValue();
            } else {
                width = c21696019va.getPhotoTagView().getWidth();
            }
            ViewGroup.LayoutParams layoutParams7 = c21696019va.getPhotoTagView().getLayoutParams();
            if ((layoutParams7 instanceof FrameLayout.LayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams7) != null) {
                marginEnd = marginLayoutParams.getMarginEnd();
            } else {
                marginEnd = 0;
            }
            iLIZIZ = width + marginEnd + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
            int iLIZIZ4 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36));
            if (iLIZIZ < iLIZIZ4) {
                iLIZIZ = iLIZIZ4;
            }
        } else {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36));
        }
        if (((Boolean) C278540Avs.LIZ.getValue()).booleanValue()) {
            if (!z) {
                C725850Sdb c725850Sdb2 = c21696019va.LLJIJIL;
                if (c725850Sdb2 != null) {
                    int visibility = c725850Sdb2.getVisibility();
                    c725850Sdb2.setVisibility(i4);
                    C1602160rnK.LIZIZ(visibility, i4, c725850Sdb2);
                    return;
                }
                return;
            }
            c725850Sdb = c21696019va.LLJIJIL;
            if (c725850Sdb == null) {
                c725850Sdb = new C725850Sdb(c21696019va.getContext());
                c725850Sdb.LIZ(lifecycleOwner, aweme2);
                FrameLayout.LayoutParams layoutParams8 = new FrameLayout.LayoutParams(iIntValue, -2);
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c725850Sdb);
                c725850Sdb.setLayoutParams(layoutParams8);
                c21696019va.LLJIJIL = c725850Sdb;
                c21696019va.getPhotoViewLayout().addView(c725850Sdb);
            } else {
                int visibility2 = c725850Sdb.getVisibility();
                c725850Sdb.setVisibility(i7);
                C1602160rnK.LIZIZ(visibility2, i7, c725850Sdb);
                c725850Sdb.LIZ(lifecycleOwner, aweme2);
                c725850Sdb.getLayoutParams().width = iIntValue;
            }
        } else {
            if (!z) {
                C725850Sdb c725850Sdb3 = c21696019va.LLJIJIL;
                if (c725850Sdb3 == null) {
                    return;
                }
                RadiusLayout photoViewLayout = c21696019va.getPhotoViewLayout();
                RemoveViewCausedNPEChecker.recordViewRemovedPoint(photoViewLayout, c725850Sdb3);
                photoViewLayout.removeView(c725850Sdb3);
                c21696019va.LLJIJIL = null;
                return;
            }
            c725850Sdb = c21696019va.LLJIJIL;
            if (c725850Sdb == null) {
                c725850Sdb = new C725850Sdb(c21696019va.getContext());
                c725850Sdb.LIZ(lifecycleOwner, aweme2);
                FrameLayout.LayoutParams layoutParams9 = new FrameLayout.LayoutParams(iIntValue, -2);
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c725850Sdb);
                c725850Sdb.setLayoutParams(layoutParams9);
                c21696019va.LLJIJIL = c725850Sdb;
                c21696019va.getPhotoViewLayout().addView(c725850Sdb);
            } else {
                c725850Sdb.LIZ(lifecycleOwner, aweme2);
                c725850Sdb.getLayoutParams().width = iIntValue;
            }
        }
        if (!C1206504nn.LIZ()) {
            return;
        }
        c725850Sdb.setReservedEndWidth(iLIZIZ);
    }
}
