package X;

import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.AwemeTextLabelModel;
import com.ss.android.ugc.aweme.feed.model.search.AwemeSearchAdModel;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0SCz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C717630SCz {
    public final C21279718Pj LIZ;

    public C717630SCz(ViewGroup viewGroup) {
        this.LIZ = (C21279718Pj) C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.et5, viewGroup, false).findViewById(R.id.u69);
    }

    public final void LIZ(AwemeRawAd awemeRawAd, EnumC658120Pre enumC658120Pre) {
        AwemeTextLabelModel label;
        String labelName;
        AwemeSearchAdModel searchAdInfo = awemeRawAd.getSearchAdInfo();
        if ((searchAdInfo == null || (labelName = searchAdInfo.outLabelText) == null) && ((label = awemeRawAd.getLabel()) == null || (labelName = label.getLabelName()) == null)) {
            return;
        }
        LIZIZ(labelName, enumC658120Pre);
    }

    public final void LIZIZ(String str, EnumC658120Pre enumC658120Pre) {
        int i;
        Context context;
        Context context2;
        int i2;
        C21279718Pj c21279718Pj;
        C21279718Pj c21279718Pj2 = this.LIZ;
        if (c21279718Pj2 == null) {
            return;
        }
        C786410Ut5.LLLLILI(c21279718Pj2, 8);
        int i3 = 0;
        if (str.length() == 0) {
            return;
        }
        C21279518Ph c21279518PhLIZ = C988900bqC.LIZ();
        C21279718Pj c21279718Pj3 = this.LIZ;
        if (c21279718Pj3 != null) {
            C786410Ut5.LLLLILI(c21279718Pj3, 0);
        }
        c21279518PhLIZ.LJIIL(str);
        int[] iArr = C658130Prf.LIZ;
        int i4 = iArr[enumC658120Pre.ordinal()];
        if (i4 != 2 && i4 != 3) {
            if (i4 != 4 && i4 != 5) {
                if (i4 != 6) {
                    i = 92;
                } else {
                    i = 82;
                }
            } else {
                i = 71;
            }
        } else {
            i = 62;
        }
        c21279518PhLIZ.LJIILJJIL(i);
        C21279718Pj c21279718Pj4 = this.LIZ;
        Context context3 = null;
        if (c21279718Pj4 != null) {
            context = c21279718Pj4.getContext();
        } else {
            context = null;
        }
        int i5 = iArr[enumC658120Pre.ordinal()];
        if (i5 != 1) {
            if (i5 != 4 && i5 != 5) {
                i3 = i5 != 6 ? R.attr.zb : R.attr.gc;
            }
        } else {
            i3 = R.attr.a03;
        }
        c21279518PhLIZ.LIZ(C475630Ikz.LIZIZ(i3, context));
        C21279718Pj c21279718Pj5 = this.LIZ;
        if (c21279718Pj5 != null) {
            context2 = c21279718Pj5.getContext();
        } else {
            context2 = null;
        }
        switch (iArr[enumC658120Pre.ordinal()]) {
            case 1:
                i2 = R.attr.ug;
                break;
            case 2:
            case 3:
                i2 = R.attr.a0p;
                break;
            case 4:
            case 5:
                i2 = R.attr.a1k;
                break;
            case 6:
                i2 = R.attr.f497ge;
                break;
            default:
                i2 = R.attr.ee;
                break;
        }
        c21279518PhLIZ.LJIILIIL(C475630Ikz.LIZIZ(i2, context2));
        C21279718Pj c21279718Pj6 = this.LIZ;
        if (c21279718Pj6 != null) {
            context3 = c21279718Pj6.getContext();
        }
        c21279518PhLIZ.LIZIZ(C0HCL.LIZ(4.0f, context3));
        c21279518PhLIZ.LIZJ(TextUtils.TruncateAt.END);
        c21279518PhLIZ.LJI();
        c21279518PhLIZ.LJIIJJI(new RelativeLayout.LayoutParams(-2, -2));
        c21279518PhLIZ.LJIIIIZZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6)));
        c21279518PhLIZ.LJIIJ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)));
        c21279518PhLIZ.LJIIIZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6)));
        c21279518PhLIZ.LJII(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)));
        C21279618Pi c21279618Pi = c21279518PhLIZ.LIZ;
        if (c21279618Pi != null && (c21279718Pj = this.LIZ) != null) {
            c21279718Pj.LIZ(c21279618Pi);
        }
    }
}
