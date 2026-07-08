package X;

import Y.ACListenerS143S0100000_8;
import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.net.Uri;
import android.os.Build;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import com.bytedance.scene.Scene;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.appwidget.CameraWidgetProvider;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: renamed from: X.0Mes, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC20647615qs("camera_widget_popup")
public final class C573760Mes extends C10GR {
    public final C19EG LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final String LLILZ;
    public final String LLILZIL;

    @Override // X.InterfaceC20660515sx
    public final int getPriority() {
        return 2510;
    }

    @Override // X.InterfaceC20660415sw
    public final C688120Qyw i2() {
        C19EG c19eg = this.LL;
        return new C688120Qyw(c19eg, c19eg, null);
    }

    @Override // X.InterfaceC20659015si
    public final void LJFF(C688120Qyw c688120Qyw, C20656615sK c20656615sK) {
        View viewSd = C786410Ut5.Sd(R.layout.d39, C786410Ut5.ne(this.LL), null);
        C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
        c1390920mIc.LJIIIIZZ(0);
        final TuxSheet tuxSheet = c1390920mIc.LIZ;
        tuxSheet.LLJJIII = viewSd;
        tuxSheet.LLILLJJLI = new DialogInterfaceOnDismissListenerC580960MqU(c20656615sK, this, 0);
        C786410Ut5.I7(new ACListenerS143S0100000_8(tuxSheet, 94), viewSd.findViewById(R.id.e1y));
        AppCompatImageView appCompatImageView = (AppCompatImageView) viewSd.findViewById(R.id.l57);
        C573720Meo.LIZ.getClass();
        appCompatImageView.setImageURI(Uri.fromFile(new C0VSJ(C573720Meo.LIZ())));
        C786410Ut5.I7(new View.OnClickListener() { // from class: X.0Met
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AppWidgetManager appWidgetManager;
                tuxSheet.dismiss();
                C573760Mes c573760Mes = this;
                C19EG c19eg = c573760Mes.LL;
                String str = c573760Mes.LLILLL;
                String str2 = c573760Mes.LLILLJJLI;
                String str3 = c573760Mes.LLILZ;
                String str4 = c573760Mes.LLILZIL;
                if (Build.VERSION.SDK_INT >= 26 && (appWidgetManager = AppWidgetManager.getInstance(c19eg)) != null && appWidgetManager.isRequestPinAppWidgetSupported()) {
                    ComponentName componentName = new ComponentName(c19eg, (Class<?>) CameraWidgetProvider.class);
                    AppWidgetManager appWidgetManager2 = AppWidgetManager.getInstance(c19eg);
                    if (appWidgetManager2 != null) {
                        appWidgetManager2.requestPinAppWidget(componentName, null, C573740Meq.LIZIZ(c19eg, str, str2, str3, str4));
                    }
                }
                C573760Mes c573760Mes2 = this;
                C2259308tD.LIZ(c573760Mes2.LLILLJJLI, c573760Mes2.LLILLL, c573760Mes2.LLILZ, c573760Mes2.LLILZIL, "add");
            }
        }, viewSd.findViewById(R.id.clq));
        tuxSheet.show(this.LL.getSupportFragmentManager(), "CameraWidgetDialogTask");
        String str = this.LLILLJJLI;
        String str2 = this.LLILLL;
        String str3 = this.LLILZ;
        String str4 = this.LLILZIL;
        List<InterfaceC2342209Fs> list = C2341909Fp.LIZ;
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("enter_from", str);
        c0lab.LJ("shoot_way", str2);
        c0lab.LJ("creation_id", str3);
        c0lab.LJ(Scene.SCENE_SERVICE, str4);
        C2341909Fp.LIZ("show_add_camera_popup", c0lab.LIZ);
    }

    public C573760Mes(C19EG c19eg, String str, String str2, String str3, String str4) {
        this.LL = c19eg;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = str3;
        this.LLILZIL = str4;
    }
}
