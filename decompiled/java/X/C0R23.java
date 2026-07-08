package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.page.SparkActivity;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.zhiliaoapp.musically.R;
import kotlin.text.a0;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0R23, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0R23 implements InterfaceC1370310llN {
    public final Music LL;

    @Override // X.InterfaceC1370310llN
    public final float LIZLLL() {
        return -1.0f;
    }

    @Override // X.InterfaceC1370310llN
    public final void LJI() {
    }

    @Override // X.InterfaceC1370310llN
    public final int LJII() {
        return R.raw.icon_trash_bin_fill;
    }

    @Override // X.InterfaceC1370310llN
    public final int LJIIIIZZ() {
        return R.raw.icon_2pt_trash_bin;
    }

    @Override // X.InterfaceC1370310llN
    public final boolean LJIIIZ() {
        return false;
    }

    @Override // X.InterfaceC1370310llN
    public final Integer LJIILJJIL() {
        return null;
    }

    @Override // X.InterfaceC1370310llN
    public final void LJIILL(InterfaceC1362720lZ8 interfaceC1362720lZ8) {
    }

    @Override // X.InterfaceC1370310llN
    public final int LJIJJLI() {
        return 0;
    }

    @Override // X.InterfaceC1370310llN
    public final void LJJIIZI(View view, BaseSharePackage baseSharePackage) {
    }

    @Override // X.InterfaceC1370310llN
    public final void LJJIJ(ImageView imageView, View view, int i) {
    }

    @Override // X.InterfaceC1370310llN
    public final Integer LJJIJIIJIL() {
        return null;
    }

    @Override // X.InterfaceC1370310llN
    public final boolean LJJIL() {
        return true;
    }

    @Override // X.InterfaceC1370310llN
    public final String LJJIZ() {
        return "";
    }

    @Override // X.InterfaceC1370310llN
    public final void LJJJI(Context context, BaseSharePackage baseSharePackage) {
    }

    @Override // X.InterfaceC1370310llN
    public final void LJJJJI(BaseSharePackage baseSharePackage) {
    }

    @Override // X.InterfaceC1370310llN
    public final Integer LJJJJIZL() {
        return null;
    }

    @Override // X.InterfaceC1370310llN
    public final boolean LJJJJL() {
        return false;
    }

    @Override // X.InterfaceC1370450llb
    public final int LJJJJLI() {
        return 100;
    }

    @Override // X.InterfaceC1370310llN
    public final boolean LJJJLZIJ() {
        return false;
    }

    @Override // X.InterfaceC1370310llN
    public final int LJJLIIIJJIZ() {
        return 2131837846;
    }

    @Override // X.InterfaceC1370310llN
    public final boolean LJJLIIIJL() {
        return false;
    }

    @Override // X.InterfaceC1370310llN
    public final boolean enable() {
        return true;
    }

    @Override // X.InterfaceC1370310llN
    public final String key() {
        return "remove_original_sound";
    }

    @Override // X.InterfaceC1370310llN
    public final String label() {
        return "";
    }

    @Override // X.InterfaceC1370310llN
    public final int LJIIJJI() {
        return !enable() ? 1 : 0;
    }

    @Override // X.InterfaceC1370310llN
    public final C0M7Z LJIIJ() {
        return C0M7Z.ShareButton;
    }

    @Override // X.InterfaceC1370310llN
    public final EnumC1216710hld LJJJZ() {
        return EnumC1216710hld.NORMAL;
    }

    public C0R23(Music music) {
        this.LL = music;
    }

    @Override // X.InterfaceC1370310llN
    public final void LJIJJ(TextView textView) {
        C1370320llO.LJ(this, textView);
    }

    @Override // X.InterfaceC1370310llN
    public final int LJJJJ(EnumC1369720lkQ enumC1369720lkQ) {
        return C1370320llO.LIZJ(enumC1369720lkQ);
    }

    @Override // X.InterfaceC1370310llN
    public final void LJIILIIL(final Context context, BaseSharePackage baseSharePackage) {
        int userCount;
        final String string = baseSharePackage.extras.getString("enter_from");
        if (string == null) {
            string = "";
        }
        long id = this.LL.getId();
        Uri.Builder builderBuildUpon = UriProtector.parse("aweme://roma_redirect/?spark_page=sound_remove").buildUpon();
        builderBuildUpon.appendQueryParameter("music_id", String.valueOf(id));
        builderBuildUpon.appendQueryParameter("enter_from", string);
        String string2 = builderBuildUpon.build().toString();
        SparkContext sparkContext = new SparkContext();
        sparkContext.LJJLIIJ(string2);
        final C259800zU c259800zU = new C259800zU();
        sparkContext.LJJLIIIJJI(new InterfaceC2217701Bqy() { // from class: X.05Qu
            @Override // X.InterfaceC2217701Bqy
            public final Context LIZJ(Context context2) {
                return context2;
            }

            @Override // X.InterfaceC2217701Bqy
            public final void LJIILLIIL(boolean z) {
            }

            @Override // X.InterfaceC2217701Bqy
            public final void LJIL(Activity activity, Context context2) {
            }

            @Override // X.InterfaceC2217701Bqy
            public final void LJJI(SparkActivity sparkActivity) {
            }

            @Override // X.InterfaceC2217701Bqy
            public final void LJJIII(SparkActivity sparkActivity, boolean z) {
            }

            @Override // X.InterfaceC2217701Bqy
            public final void LJJIIJZLJL(SparkActivity sparkActivity) {
            }

            @Override // X.InterfaceC2217701Bqy
            public final void LJJIJIIJI(SparkActivity sparkActivity) {
            }

            @Override // X.InterfaceC2217701Bqy
            public final void LJJIL(SparkActivity sparkActivity, Bundle bundle) {
            }

            @Override // X.InterfaceC2217701Bqy
            public final void LJJIZ(SparkActivity sparkActivity, int i, String[] strArr, int[] iArr) {
            }

            @Override // X.InterfaceC2217701Bqy
            public final void LJJJ(SparkActivity sparkActivity) {
            }

            @Override // X.InterfaceC2217701Bqy
            public final void LJJJJJ(SparkActivity sparkActivity) {
            }

            @Override // X.InterfaceC2217701Bqy
            public final void LJJJJJL(SparkActivity sparkActivity, Configuration configuration) {
            }

            @Override // X.InterfaceC2217701Bqy
            public final void LJJJJLL(SparkActivity sparkActivity) {
            }

            @Override // X.InterfaceC2217701Bqy
            public final void LJJJJZI(SparkActivity sparkActivity) {
            }

            @Override // X.InterfaceC2217701Bqy
            public final void LJJLIIIJJI(SparkActivity sparkActivity) {
            }

            @Override // X.InterfaceC2217701Bqy
            public final void LJJLIIIJJIZ(SparkActivity sparkActivity) {
            }

            @Override // X.InterfaceC2217701Bqy
            public final void LJJLIIIJL(SparkActivity sparkActivity, Bundle bundle) {
            }

            @Override // X.InterfaceC2217701Bqy
            public final boolean LJJLIIIJLLLLLLLZ(SparkActivity sparkActivity) {
                return false;
            }

            @Override // X.InterfaceC2217701Bqy
            public final void LJJLIIJ(SparkActivity sparkActivity, Bundle bundle) {
            }

            @Override // X.InterfaceC2217701Bqy
            public final void LJJLJLI(SparkActivity sparkActivity) {
            }

            @Override // X.InterfaceC2217701Bqy
            public final void LJJLL(SparkActivity sparkActivity) {
            }

            @Override // X.InterfaceC2217701Bqy
            public final void finish() {
            }

            @Override // X.InterfaceC2217701Bqy
            public final void onActivityResult(int i, int i2, Intent intent) {
            }

            @Override // X.InterfaceC2217701Bqy
            public final void onRestoreInstanceState(Bundle bundle) {
            }

            @Override // X.InterfaceC1163130gND
            public final void release() {
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.InterfaceC2217701Bqy
            public final void LJJIIZI(SparkActivity sparkActivity, Bundle bundle) {
                c259800zU.element = sparkActivity;
            }
        });
        sparkContext.LJJJJZI(new AbstractC1542200qEc() { // from class: X.0R24
            @Override // X.AbstractC1537870q7d
            public final void LJJZZIII(InterfaceC1541990qEH interfaceC1541990qEH, String str) throws JSONException {
                SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "//webview");
                StringBuilder sb = new StringBuilder();
                SettingsManager.LIZLLL().getClass();
                String strLJI = SettingsManager.LJI("sound_track_deletion_url", "");
                if (!(!a0.LJJJIL(strLJI)) || strLJI == null) {
                    strLJI = "https://inapp.tiktokv.com/tpp/inapp/pns_product_poseidon/sound-remove.html?hide_nav_bar=1&should_full_screen=1&_pia_=1&bdhm_bid=tiktok_privacy_product_hybrid&music_id=";
                }
                sb.append(strLJI);
                sb.append(this.LL.getId());
                sb.append("&enter_from=");
                sb.append(string);
                smartRouteBuildRoute.withParam("url", sb.toString());
                smartRouteBuildRoute.withParam("use_spark", 1);
                smartRouteBuildRoute.open();
                SparkActivity sparkActivity = c259800zU.element;
                if (sparkActivity != null) {
                    sparkActivity.finish();
                }
            }
        });
        C1541950qED.LIZJ.getClass();
        new C1541950qED(context, sparkContext).LIZIZ();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", string);
        c2344009Gk.LJIIIIZZ("song_id", this.LL.getMid());
        Music music = this.LL;
        if (music != null) {
            userCount = music.getUserCount();
        } else {
            userCount = 0;
        }
        c2344009Gk.LIZJ(userCount, "item_cnt");
        C20684815ws.LJIILLIIL("click_remove_original_sound", c2344009Gk.LIZ);
    }

    @Override // X.InterfaceC1370310llN
    public final void LJJJJLL(View view, BaseSharePackage baseSharePackage) {
        C1370320llO.LIZ(this, view, baseSharePackage);
    }

    @Override // X.InterfaceC1370310llN
    public final void LJJLIIIIJ(View view, BaseSharePackage baseSharePackage) {
        C1370320llO.LIZIZ(this, view, baseSharePackage);
    }

    @Override // X.InterfaceC1370310llN
    public final void LJJLIIIJILLIZJL(Context context, BaseSharePackage baseSharePackage) {
        C1370320llO.LIZLLL(context, baseSharePackage, this);
    }
}
