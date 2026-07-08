package X;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS547S0100000_3;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS619S0100000_5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0EFK, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EFK extends RecyclerView.ViewHolder {
    public final Function2<String, Long, Bitmap> LL;
    public final View LLILLJJLI;
    public final View LLILLL;
    public final TuxTextView LLILZ;
    public final TuxTextView LLILZIL;
    public final TuxIconView LLILZLL;
    public final SmartImageView LLIZ;
    public final View LLIZLLLIL;
    public final C01GW LLJ;
    public final C01GW LLJI;
    public final C01GW LLJIJIL;
    public final C01GW LLJILJIL;
    public C352950Dsb LLJILJILJ;
    public final C01GW LLJILLL;
    public final C01GW LLJJ;

    public final void I5(C352950Dsb c352950Dsb) {
        int iLIZ;
        Bitmap bitmapInvoke;
        this.LLJILJILJ = c352950Dsb;
        switch (C351450DqB.LIZ[c352950Dsb.LIZIZ.ordinal()]) {
            case 1:
                Integer num = (Integer) this.LLJI.getValue();
                if (num != null) {
                    this.LLILLL.setBackgroundColor(num.intValue());
                }
                C786410Ut5.LLFF(4, this.LLIZ);
                C786410Ut5.LLLLLLZZ(this.LLILZLL, 0);
                ViewGroup.LayoutParams layoutParams = this.LLILZLL.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
                    layoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
                }
                this.LLILZLL.requestLayout();
                this.LLILZLL.setIconRes(R.raw.icon_text_latin_thin);
                this.LLILZLL.setTintColorRes(R.attr.bqg);
                return;
            case 2:
                Integer num2 = (Integer) this.LLJIJIL.getValue();
                if (num2 != null) {
                    this.LLILLL.setBackgroundColor(num2.intValue());
                }
                C786410Ut5.LLFF(4, this.LLIZ);
                C786410Ut5.LLLLLLZZ(this.LLILZLL, 0);
                ViewGroup.LayoutParams layoutParams2 = this.LLILZLL.getLayoutParams();
                if (layoutParams2 != null) {
                    layoutParams2.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
                    layoutParams2.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
                }
                this.LLILZLL.requestLayout();
                this.LLILZLL.setIconRes(R.raw.icon_closed_caption);
                this.LLILZLL.setTintColorRes(R.attr.bqf);
                return;
            case 3:
                Integer num3 = (Integer) this.LLJILJIL.getValue();
                if (num3 != null) {
                    this.LLILLL.setBackgroundColor(num3.intValue());
                }
                C786410Ut5.LLFF(4, this.LLIZ);
                C786410Ut5.LLLLLLZZ(this.LLILZLL, 0);
                ViewGroup.LayoutParams layoutParams3 = this.LLILZLL.getLayoutParams();
                if (layoutParams3 != null) {
                    layoutParams3.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
                    layoutParams3.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
                }
                this.LLILZLL.requestLayout();
                this.LLILZLL.setIconRes(R.raw.icon_control_fill);
                this.LLILZLL.setTintColorRes(R.attr.eu);
                return;
            case 4:
                NLETrackSlot nLETrackSlot = c352950Dsb.LJI;
                C370720EgA.LIZ.getClass();
                String strLIZIZ = C370720EgA.LIZIZ(nLETrackSlot);
                if (C351220Dpo.LLJJIJIL(nLETrackSlot)) {
                    iLIZ = 0;
                } else {
                    NLESegmentVideo nLESegmentVideoDynamicCast = NLESegmentVideo.dynamicCast((NLENode) nLETrackSlot.getMainSegment());
                    if (nLESegmentVideoDynamicCast != null) {
                        iLIZ = C370720EgA.LIZ((int) (nLESegmentVideoDynamicCast.getTimeClipStart() / ((long) LSPassThroughRecordSizeConfig.DEFAULT)));
                    } else {
                        return;
                    }
                }
                Integer num4 = (Integer) this.LLJ.getValue();
                if (num4 != null) {
                    this.LLILLL.setBackgroundColor(num4.intValue());
                }
                C786410Ut5.LLFF(4, this.LLIZ);
                C786410Ut5.LLLLLLZZ(this.LLILZLL, 0);
                this.LLILZLL.setImageDrawable(null);
                ViewGroup.LayoutParams layoutParams4 = this.LLILZLL.getLayoutParams();
                if (layoutParams4 != null) {
                    layoutParams4.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(42));
                    layoutParams4.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(42));
                }
                if (strLIZIZ.length() != 0 && (bitmapInvoke = this.LL.invoke(strLIZIZ, Long.valueOf(iLIZ))) != null) {
                    this.LLILZLL.setImageBitmap(bitmapInvoke);
                    return;
                }
                return;
            case 5:
            case 6:
            case 7:
                String str = c352950Dsb.LJ;
                Integer num5 = (Integer) this.LLJ.getValue();
                if (num5 != null) {
                    this.LLILLL.setBackgroundColor(num5.intValue());
                }
                C786410Ut5.LLFF(0, this.LLIZ);
                C786410Ut5.LLLLLLZZ(this.LLILZLL, 4);
                if (str == null) {
                    this.LLIZ.setController(null);
                    return;
                }
                Uri uriFromFile = UriProtector.parse(str);
                if (!Intrinsics.LJFF(uriFromFile.getScheme(), "content") && !Intrinsics.LJFF(uriFromFile.getScheme(), "http") && !Intrinsics.LJFF(uriFromFile.getScheme(), "https")) {
                    uriFromFile = Uri.fromFile(new C0VSJ(str));
                }
                C1331670kl3 c1331670kl3LJI = C1331660kl2.LJI(uriFromFile);
                c1331670kl3LJI.LJJIJL(this.LLIZ.getContext());
                c1331670kl3LJI.LJJI(this.LLIZ);
                C786410Ut5.h3(c1331670kl3LJI);
                return;
            default:
                throw new C1954807lC();
        }
    }

    public final void L5(C352950Dsb c352950Dsb) {
        this.LLJILJILJ = c352950Dsb;
        if (c352950Dsb.LJFF) {
            this.LLILLJJLI.setBackground((Drawable) this.LLJILLL.getValue());
        } else {
            this.LLILLJJLI.setBackground((Drawable) this.LLJJ.getValue());
        }
    }

    public C0EFK(View view, AwS619S0100000_5 awS619S0100000_5) {
        Drawable drawableLIZ;
        super(view);
        this.LL = awS619S0100000_5;
        View viewFindViewById = view.findViewById(R.id.ikv);
        this.LLILLJJLI = viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.ikq);
        this.LLILLL = viewFindViewById2;
        this.LLILZ = (TuxTextView) view.findViewById(R.id.ikt);
        this.LLILZIL = (TuxTextView) view.findViewById(R.id.iko);
        this.LLILZLL = (TuxIconView) view.findViewById(R.id.ikr);
        this.LLIZ = (SmartImageView) view.findViewById(R.id.iks);
        this.LLIZLLLIL = view.findViewById(R.id.ikp);
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS547S0100000_3(view, 5));
        this.LLJ = c01gwLIZIZ;
        this.LLJI = C452501pT.LIZIZ(new AwS547S0100000_3(view, 6));
        this.LLJIJIL = C452501pT.LIZIZ(new AwS547S0100000_3(view, 4));
        this.LLJILJIL = C452501pT.LIZIZ(new AwS547S0100000_3(view, 3));
        this.LLJILLL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 9));
        this.LLJJ = C452501pT.LIZIZ(new AwS549S0100000_5(this, 10));
        boolean zLIZ = C357780E0y.LIZ();
        Integer numValueOf = Integer.valueOf(R.attr.zf);
        if (zLIZ) {
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZIZ = numValueOf;
            drawableLIZ = c384050F3z.LIZ(view.getContext());
        } else {
            C384050F3z c384050F3z2 = new C384050F3z();
            c384050F3z2.LIZIZ = numValueOf;
            c384050F3z2.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(12));
            drawableLIZ = c384050F3z2.LIZ(view.getContext());
        }
        viewFindViewById.setBackground(drawableLIZ);
        Integer num = (Integer) c01gwLIZIZ.getValue();
        if (num != null) {
            viewFindViewById2.setBackgroundColor(num.intValue());
        }
    }
}
