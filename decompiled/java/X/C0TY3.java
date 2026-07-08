package X;

import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdk.adminsetting.fastaddblockwords.LiveFastAddBlockKeywordsDialog;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0TY3, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class C0TY3 extends C2217421BqW implements Function1<EnumC748580TYa, Unit> {
    public C0TY3(Object obj) {
        super(1, obj, LiveFastAddBlockKeywordsDialog.class, "switchPage", "switchPage(Lcom/bytedance/android/livesdk/dataChannel/BroadcastDialogPage;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(EnumC748580TYa enumC748580TYa) {
        Fragment fragment;
        EnumC748580TYa enumC748580TYa2 = enumC748580TYa;
        LiveFastAddBlockKeywordsDialog liveFastAddBlockKeywordsDialog = (LiveFastAddBlockKeywordsDialog) this.receiver;
        liveFastAddBlockKeywordsDialog.getClass();
        int i = C0TY2.LIZ[enumC748580TYa2.ordinal()];
        if (i != 1) {
            if (i == 2) {
                fragment = (Fragment) liveFastAddBlockKeywordsDialog.LLILLL.getValue();
            }
            return Unit.LIZ;
        }
        fragment = (Fragment) liveFastAddBlockKeywordsDialog.LLILZ.getValue();
        if (fragment != null) {
            C19EH c19ehLJIIJ = liveFastAddBlockKeywordsDialog.getChildFragmentManager().LJIIJ();
            if (enumC748580TYa2.getGoNextPage()) {
                c19ehLJIIJ.LJIJJ(R.anim.hf, R.anim.hc);
            } else {
                c19ehLJIIJ.LJIJJ(R.anim.hb, R.anim.hg);
            }
            c19ehLJIIJ.LJIJ(R.id.eqx, fragment, null);
            c19ehLJIIJ.LJIIIZ();
        }
        return Unit.LIZ;
    }
}
