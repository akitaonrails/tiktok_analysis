package X;

import android.content.Intent;
import com.bytedance.router.FakeFragment;
import com.ss.android.ugc.aweme.socialavatar.view.ChoosePhotoActivityLauncher;
import com.ss.android.ugc.aweme.socialavatar.view.v2.SocialAvatarChoosePhotoActivity;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0HfU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C446740HfU extends C09AY implements Function1<Boolean, Unit> {
    public final /* synthetic */ C19EG LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ InterfaceC20236714Gf<Pair<String, String>> LLILZ;
    public final /* synthetic */ ChoosePhotoActivityLauncher LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C446740HfU(C19EG c19eg, String str, boolean z, C2252611DEt c2252611DEt, ChoosePhotoActivityLauncher choosePhotoActivityLauncher) {
        super(1);
        this.LL = c19eg;
        this.LLILLJJLI = str;
        this.LLILLL = z;
        this.LLILZ = c2252611DEt;
        this.LLILZIL = choosePhotoActivityLauncher;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) throws Throwable {
        if (bool.booleanValue()) {
            Intent intent = new Intent(this.LL, (Class<?>) SocialAvatarChoosePhotoActivity.class);
            String str = this.LLILLJJLI;
            boolean z = this.LLILLL;
            intent.putExtra("key_photo_select_min_count", 1);
            intent.putExtra("key_photo_select_max_count", 1);
            intent.putExtra("key_enable_selected_medias_container_ui", false);
            intent.putExtra("key_support_flag", 1);
            intent.putExtra("key_choose_request_code", 0);
            intent.putExtra("enter_from", str);
            intent.putExtra("source", "imagine_studio_album_source");
            if (z) {
                intent.putExtra("album_header_title", 2131835932);
            }
            intent.putExtra("skip_face_detection", !z);
            intent.putExtra("prevent_album_guide_panel", true);
            FakeFragment fakeFragment = new FakeFragment();
            fakeFragment.setCallback(new C462920IDi(this.LLILZ, this.LLILZIL, 0));
            C19EH c19ehLJIIJ = this.LL.getSupportFragmentManager().LJIIJ();
            c19ehLJIIJ.LIZLLL(fakeFragment, String.valueOf(System.currentTimeMillis()));
            c19ehLJIIJ.LJIIJJI();
            C1701330uNH.LIZ(intent, fakeFragment);
            C2204961BRm.LLLLIIL(fakeFragment, intent, 24532, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmnYJbP0DPP/MoJBwQZsa04t9r0wBeW1Jjy0AzuaZELAgWNZqe2kir/CuSXxQ==", null));
        }
        return Unit.LIZ;
    }
}
