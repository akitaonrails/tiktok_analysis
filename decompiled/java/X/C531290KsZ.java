package X;

import Y.ACListenerS112S0200000_8;
import Y.ACListenerS143S0100000_8;
import android.net.Uri;
import android.text.format.DateFormat;
import android.util.Size;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.creative.model.forward.ForwardMedia;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.onthisday.OnThisDayTiktokMediaModel;
import com.zhiliaoapp.musically.R;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS194S0000000_8;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0KsZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C531290KsZ extends C0J1A {
    public static final /* synthetic */ int LLJILLL = 0;
    public final Function1<OnThisDayTiktokMediaModel, Unit> LLILLJJLI;
    public final Function2<View, OnThisDayTiktokMediaModel, Unit> LLILLL;
    public final boolean LLILZ;
    public final SmartImageView LLILZIL;
    public final View LLILZLL;
    public final TuxTextView LLIZ;
    public final View LLIZLLLIL;
    public final TuxTextView LLJ;
    public final TuxTextView LLJI;
    public final TuxTextView LLJIJIL;
    public OnThisDayTiktokMediaModel LLJILJIL;
    public final C01GW LLJILJILJ;

    public final void L5(OnThisDayTiktokMediaModel onThisDayTiktokMediaModel) {
        if (onThisDayTiktokMediaModel.selectIndex > 0) {
            this.LLJ.setSelected(true);
            this.LLJ.setText(String.valueOf(onThisDayTiktokMediaModel.selectIndex));
        } else {
            this.LLJ.setSelected(false);
            this.LLJ.setText((CharSequence) null);
        }
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [REQUEST, X.0kbR] */
    public final void I5(OnThisDayTiktokMediaModel onThisDayTiktokMediaModel, List<Object> list, boolean z) {
        Uri uri;
        String strK4;
        long j;
        this.LLJILJIL = onThisDayTiktokMediaModel;
        if (list.isEmpty()) {
            if (!C530690Krb.LIZJ(onThisDayTiktokMediaModel)) {
                this.LLILZIL.setScaleType(ImageView.ScaleType.CENTER_CROP);
                SmartImageView smartImageView = this.LLILZIL;
                Size size = new Size(((Number) this.LLJILJILJ.getValue()).intValue(), (((Number) this.LLJILJILJ.getValue()).intValue() * 8) / 5);
                C23216097u c23216097u = C23215097t.LIZ;
                C23215097t.LIZLLL(smartImageView, onThisDayTiktokMediaModel, size, new C531300Ksa());
            } else if (onThisDayTiktokMediaModel.loadSource == EnumC538220L8y.PHOTO_PICKER) {
                ?? LIZ = C1325700kbQ.LIZLLL(C530830Krp.LIZ(onThisDayTiktokMediaModel)).LIZ();
                C1320810kTX c1320810kTXLIZJ = C1322200kVm.LIZJ();
                c1320810kTXLIZJ.LJIILJJIL = this.LLILZIL.getController();
                c1320810kTXLIZJ.LIZLLL = LIZ;
                this.LLILZIL.setController(c1320810kTXLIZJ.LIZ());
            } else {
                String str = onThisDayTiktokMediaModel.thumbnail;
                if (str == null || (uri = UriProtector.parse(str)) == null) {
                    uri = Uri.EMPTY;
                }
                C1331670kl3 c1331670kl3LJI = C1331660kl2.LJI(uri);
                c1331670kl3LJI.LJJ = EnumC1338240kve.CENTER_CROP;
                c1331670kl3LJI.LJJ(this.LLILZIL);
                C786410Ut5.h3(c1331670kl3LJI);
            }
            if (onThisDayTiktokMediaModel.LJIIJ()) {
                C786410Ut5.LJLLLLLL(8, this.LLILZLL);
            } else {
                C786410Ut5.LJLLLLLL(0, this.LLILZLL);
                int iLIZIZ = C814420VxA.LIZIZ((onThisDayTiktokMediaModel.duration * 1.0f) / LSPassThroughRecordSizeConfig.DEFAULT);
                TuxTextView tuxTextView = this.LLIZ;
                int i = iLIZIZ % 60;
                int i2 = iLIZIZ / 60;
                int i3 = i2 / 60;
                int i4 = i2 % 60;
                if (i3 == 0) {
                    strK4 = C786410Ut5.k4(Locale.getDefault(), "%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i4), Integer.valueOf(i)}, 2));
                } else {
                    strK4 = C786410Ut5.k4(Locale.getDefault(), "%02d:%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i)}, 3));
                }
                tuxTextView.setText(strK4);
            }
            L5(onThisDayTiktokMediaModel);
            if (z) {
                C786410Ut5.T4(this.itemView, 0.5f);
            } else {
                C786410Ut5.T4(this.itemView, 1.0f);
            }
            if (C0C64.LJIILLIIL().LJIIIZ(31744, "enable_eoy_otd_new_style", true, false)) {
                if (onThisDayTiktokMediaModel.loadSource == EnumC538220L8y.PHOTO_PICKER && this.LLILZ) {
                    C786410Ut5.LLLLZLL(this.LLJI, 0);
                } else {
                    C786410Ut5.LLLLZLL(this.LLJI, 8);
                }
                ForwardMedia forwardMedia = onThisDayTiktokMediaModel.forwardMedia;
                if (forwardMedia != null) {
                    j = forwardMedia.createTime;
                } else {
                    j = onThisDayTiktokMediaModel.modify;
                }
                if (j > 0 && this.LLILZ) {
                    this.LLJIJIL.setText(new SimpleDateFormat(DateFormat.getBestDateTimePattern(Locale.getDefault(), "MMMd"), Locale.getDefault()).format(new Date(j * ((long) LSPassThroughRecordSizeConfig.DEFAULT))));
                    C786410Ut5.LLLLZLL(this.LLJIJIL, 0);
                    return;
                } else {
                    C786410Ut5.LLLLZLL(this.LLJIJIL, 8);
                    return;
                }
            }
            return;
        }
        for (Object obj : list) {
            if (Intrinsics.LJFF(obj, "update_select_state")) {
                L5(onThisDayTiktokMediaModel);
            } else if (Intrinsics.LJFF(obj, "update_gray_item")) {
                if (z) {
                    C786410Ut5.T4(this.itemView, 0.5f);
                } else {
                    C786410Ut5.T4(this.itemView, 1.0f);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C531290KsZ(View view, Function1<? super OnThisDayTiktokMediaModel, Unit> function1, Function2<? super View, ? super OnThisDayTiktokMediaModel, Unit> function2, boolean z) {
        super(view);
        this.LLILLJJLI = function1;
        this.LLILLL = function2;
        this.LLILZ = z;
        this.LLILZIL = (SmartImageView) view.findViewById(R.id.cover);
        this.LLILZLL = view.findViewById(R.id.gc0);
        this.LLIZ = (TuxTextView) view.findViewById(R.id.gco);
        View viewFindViewById = view.findViewById(R.id.ukt);
        this.LLIZLLLIL = viewFindViewById;
        this.LLJ = (TuxTextView) view.findViewById(R.id.uku);
        TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.aya);
        this.LLJI = tuxTextView;
        this.LLJIJIL = (TuxTextView) view.findViewById(R.id.ffu);
        this.LLJILJILJ = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(156));
        if (z) {
            C1378990lzN.LIZIZ(tuxTextView, Float.valueOf(C390810FTz.LIZ(4.0f)), null, null, null, null, 30);
        }
        C1378990lzN.LIZIZ(view, Float.valueOf(C390810FTz.LIZ(12.0f)), null, null, null, null, 30);
        C786410Ut5.I7(new ACListenerS143S0100000_8(this, 62), viewFindViewById);
        C786410Ut5.I7(new ACListenerS112S0200000_8(this, view, 5), view);
    }
}
