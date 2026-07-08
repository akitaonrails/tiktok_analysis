package X;

import android.os.Bundle;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.aigc.AIGCPictureHandler;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0MJQ, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MJQ extends C09AY implements Function1<Boolean, Unit> {
    public final /* synthetic */ C19EG LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ EnumC1221320ht4 LLILZ;
    public final /* synthetic */ boolean LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0MJQ(C19EG c19eg, EnumC1221320ht4 enumC1221320ht4, String str, String str2, boolean z) {
        super(1);
        this.LL = c19eg;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = enumC1221320ht4;
        this.LLILZIL = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        if (bool.booleanValue()) {
            Bundle bundle = new Bundle();
            EnumC1221320ht4 enumC1221320ht4 = this.LLILZ;
            boolean z = this.LLILZIL;
            String str = this.LLILLJJLI;
            String str2 = this.LLILLL;
            C786410Ut5.LJJIZ(bundle, "key_function_on_render_done", new C0HMC() { // from class: X.0MJS
                @Override // X.C0HMC
                public void callback(C19EG c19eg) {
                    C01GW c01gw = C566350MJd.LIZ;
                    if (!((Keva) c01gw.getValue()).getBoolean("keva_key_tips", false)) {
                        C566350MJd.LIZIZ(c19eg);
                        ((Keva) c01gw.getValue()).storeBoolean("keva_key_tips", true);
                    }
                }
            });
            AIGCPictureHandler aIGCPictureHandler = new AIGCPictureHandler(true, enumC1221320ht4, 1, "ai_avatar", z, str);
            C786410Ut5.LJJIZ(bundle, "key_function_on_click_next", aIGCPictureHandler);
            bundle.putInt("key_photo_select_min_count", 1);
            bundle.putInt("key_photo_select_max_count", 1);
            C786410Ut5.LJJJI("shoot_way", "ai_avatar", bundle);
            C786410Ut5.LJJJI("enter_from", str2, bundle);
            C786410Ut5.LJJJI("enter_method", str, bundle);
            bundle.putInt("key_choose_scene", 25);
            bundle.putInt("key_support_flag", 2);
            C786410Ut5.LJJIZ(bundle, "key_album_interact_view_holder_list", C1697810uHb.LJ(new C0MJV(aIGCPictureHandler, "ai_avatar")));
            String str3 = MvChoosePhotoActivity._pnsPageId;
            C0L0F.LIZLLL(this.LL, bundle, 0);
            C0MJJ c0mjj = C0MJJ.LIZ;
            String str4 = this.LLILLJJLI;
            String str5 = this.LLILLL;
            c0mjj.getClass();
            C0MJJ.LIZJ(str4, str5);
        }
        return Unit.LIZ;
    }
}
