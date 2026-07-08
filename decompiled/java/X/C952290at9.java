package X;

import Y.ACListenerS150S0100000_15;
import android.content.Context;
import android.graphics.BitmapFactory;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiguestNoticeboardV2Setting;
import com.zhiliaoapp.musically.R;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS416S0200000_15;

/* JADX INFO: renamed from: X.0at9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C952290at9 extends LinearLayout {
    public final Function0<Unit> LL;

    public C952290at9(Context context, C953770avX c953770avX, AwS416S0200000_15 awS416S0200000_15) {
        int i;
        super(context);
        this.LL = awS416S0200000_15;
        View viewSd = C786410Ut5.Sd(R.layout.hfh, C972080bP4.LIZ(C786410Ut5.ne(context)), this);
        C1322090kVb c1322090kVb = (C1322090kVb) viewSd.findViewById(R.id.k55);
        TextView textView = (TextView) viewSd.findViewById(R.id.title);
        C16FS c16fs = (C16FS) viewSd.findViewById(R.id.use_btn);
        c1322090kVb.setImageBitmap(BitmapFactory.decodeFile(c953770avX.LJ));
        if (MultiguestNoticeboardV2Setting.INSTANCE.isPreviewEnable()) {
            i = 2131854018;
        } else {
            i = 2131854017;
        }
        textView.setText(C497740JfY.LJIJJ(i, new SimpleDateFormat("MMMM d, h:mm a", Locale.getDefault()).format(new Date(c953770avX.LIZJ))));
        c16fs.setText(C497740JfY.LJIJI(2131853999));
        C786410Ut5.h8(c16fs, new ACListenerS150S0100000_15(this, DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL));
        setBackgroundColor(C497740JfY.LIZLLL(R.attr.c69, context));
        setGravity(16);
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
        setPadding(iLIZIZ, iLIZIZ, iLIZIZ, iLIZIZ);
    }
}
