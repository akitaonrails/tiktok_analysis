package X;

import android.graphics.drawable.Animatable;
import android.view.ViewGroup;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.choosemusic.fragment.MusicClassDetailFragment;
import com.ss.android.ugc.aweme.global.config.settings.pojo.ContentLanguageGuideSetting;
import java.util.HashMap;

/* JADX INFO: renamed from: X.12Z3, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public class C12Z3 extends C1320700kTM {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.C1320700kTM, X.InterfaceC1320650kTH
    public final void LJ(String str, Object obj, Animatable animatable) {
        switch (this.$t) {
            case 0:
                LJ$0(this, str, obj, animatable);
                break;
            case 1:
                LJ$1(this, str, obj, animatable);
                break;
            default:
                super.LJ(str, obj, animatable);
                break;
        }
    }

    public C12Z3(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l1 = obj;
        this.l0 = obj2;
    }

    public static final void LJ$0(C12Z3 c12z3, String str, Object obj, Animatable animatable) {
        InterfaceC1330440kj4 interfaceC1330440kj4 = (InterfaceC1330440kj4) obj;
        double width = ((double) interfaceC1330440kj4.getWidth()) / ((double) interfaceC1330440kj4.getHeight());
        double dLIZ = C341940Daq.LIZ(21.0d);
        ViewGroup.LayoutParams layoutParams = ((RemoteImageView) c12z3.l0).getLayoutParams();
        layoutParams.width = (int) (width * dLIZ);
        layoutParams.height = (int) dLIZ;
        C786410Ut5.f7((RemoteImageView) c12z3.l0, layoutParams);
        HashMap map = new HashMap();
        map.put("enter_from", "change_music_page");
        map.put("category_name", ((MusicClassDetailFragment) c12z3.l1).LLJJIJI);
        C20684815ws.LJIILLIIL("show_ad_sticker", map);
    }

    public static final void LJ$1(C12Z3 c12z3, String str, Object obj, Animatable animatable) {
        try {
            ((C19398110up) c12z3.l0).LLILLJJLI.LJJIJIIJIL(((ContentLanguageGuideSetting) c12z3.l1).getCode());
        } catch (C316660CbA e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
