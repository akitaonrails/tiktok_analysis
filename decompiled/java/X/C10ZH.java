package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.ss.android.ugc.aweme.deeplink.IDeepLinkService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.Map;

/* JADX INFO: renamed from: X.10ZH, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10ZH implements IDeepLinkService {
    public static final C10ZH LIZIZ = new C10ZH();
    public final /* synthetic */ IDeepLinkService LIZ = (IDeepLinkService) ServiceManager.get().getService(IDeepLinkService.class);

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final String LJJ(String str) {
        return this.LIZ.LJJ(str);
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final boolean LJJI(String str) {
        return this.LIZ.LJJI(str);
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final boolean LJJIFFI() {
        return this.LIZ.LJJIFFI();
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final boolean LJJII(Context context) {
        return this.LIZ.LJJII(context);
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final long LJJIII() {
        return this.LIZ.LJJIII();
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final boolean LJJIIJ() {
        return this.LIZ.LJJIIJ();
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final boolean LJJIIJZLJL(Activity activity) {
        return this.LIZ.LJJIIJZLJL(activity);
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final String LJJIIZ(Context context) {
        return this.LIZ.LJJIIZ(context);
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final boolean LJJIIZI(String str) {
        return this.LIZ.LJJIIZI(str);
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final void LJJIJ() {
        this.LIZ.LJJIJ();
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final String LJJIJIIJI(Uri uri) {
        return this.LIZ.LJJIJIIJI(uri);
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final boolean LJJIJIIJIL(Aweme aweme, String str) {
        return this.LIZ.LJJIJIIJIL(aweme, str);
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final void LJJIJIL(Activity activity, String str, C1962707mT c1962707mT) {
        this.LIZ.LJJIJIL(activity, str, c1962707mT);
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final boolean LJJIJL() {
        return this.LIZ.LJJIJL();
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final Map<String, String> LJJIJLIJ(String str) {
        return this.LIZ.LJJIJLIJ(str);
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final void LJJIL() {
        this.LIZ.LJJIL();
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final boolean LJJIZ(String str) {
        return this.LIZ.LJJIZ(str);
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final boolean LJJJ(Context context, Intent intent, String str) {
        return this.LIZ.LJJJ(context, intent, str);
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final void LJJJI(BaseActivity baseActivity) {
        this.LIZ.LJJJI(baseActivity);
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final boolean LJJJIL(String str, String str2) {
        return this.LIZ.LJJJIL(str, str2);
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final void LJJJJ() {
        this.LIZ.LJJJJ();
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final boolean LJJJJI() {
        return this.LIZ.LJJJJI();
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final void LJJJJIZL(Intent intent) {
        this.LIZ.LJJJJIZL(intent);
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final String LJJJJJ() {
        return this.LIZ.LJJJJJ();
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final boolean LJJJJJL() {
        return this.LIZ.LJJJJJL();
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final boolean LJJJJL(Aweme aweme) {
        return this.LIZ.LJJJJL(aweme);
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final boolean LJJJJLI() {
        return this.LIZ.LJJJJLI();
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final boolean LJJJJLL() {
        return this.LIZ.LJJJJLL();
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final void LJJJJZ(int i, Uri uri, String str) {
        this.LIZ.LJJJJZ(i, uri, str);
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final void LJJJJZI(String str, String str2, String str3, String str4, String str5, String str6, boolean z, boolean z2) {
        this.LIZ.LJJJJZI(str, str2, str3, str4, str5, str6, z, z2);
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final long LJJJLIIL() {
        return this.LIZ.LJJJLIIL();
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final boolean LJJJLL() {
        return this.LIZ.LJJJLL();
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final boolean LJJJLZIJ() {
        return this.LIZ.LJJJLZIJ();
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final boolean LJJJZ(String str) {
        return this.LIZ.LJJJZ(str);
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final boolean LJJL(boolean z, Uri uri) {
        return this.LIZ.LJJL(z, uri);
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final void LJJLI(int i, String str, String str2) {
        this.LIZ.LJJLI(i, str, str2);
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final String LJJLIIIIJ(String str) {
        return this.LIZ.LJJLIIIIJ(str);
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final boolean LJJLIIIJ(Context context, String str, String str2) {
        return this.LIZ.LJJLIIIJ(context, str, str2);
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final boolean LJJLIIIJILLIZJL() {
        return this.LIZ.LJJLIIIJILLIZJL();
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final void LJJLIIIJJI() {
        this.LIZ.LJJLIIIJJI();
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final String LJJLIIIJJIZ() {
        return this.LIZ.LJJLIIIJJIZ();
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final int LJJLIIIJL() {
        return this.LIZ.LJJLIIIJL();
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final boolean LJJLIIIJLJLI(Uri uri) {
        return this.LIZ.LJJLIIIJLJLI(uri);
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final boolean LJJLIIIJLLLLLLLZ() {
        return this.LIZ.LJJLIIIJLLLLLLLZ();
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final Class<? extends Activity> LJJLIIJ() {
        return this.LIZ.LJJLIIJ();
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final boolean LJJLIL(String str, String str2) {
        return this.LIZ.LJJLIL(str, str2);
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final boolean LJJLJ(Activity activity, C1962707mT c1962707mT) {
        return this.LIZ.LJJLJ(activity, c1962707mT);
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final boolean LJJLJLI() {
        return this.LIZ.LJJLJLI();
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final boolean LJJLL() {
        return this.LIZ.LJJLL();
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final boolean LJJZ() {
        return this.LIZ.LJJZ();
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final boolean LJJZZI(Uri uri) {
        return this.LIZ.LJJZZI(uri);
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final String LJJZZIII(String str, Map map) {
        return this.LIZ.LJJZZIII(str, map);
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final boolean LJL() {
        return this.LIZ.LJL();
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final void LJLI(String str) {
        this.LIZ.LJLI(str);
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final boolean LJLIIIL(Activity activity) {
        return this.LIZ.LJLIIIL(activity);
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final String LJLIIL(String str) {
        return this.LIZ.LJLIIL(str);
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final int LJLIL() {
        return this.LIZ.LJLIL();
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final void LJLILLLLZI(String str, String str2) {
        this.LIZ.LJLILLLLZI(str, str2);
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final Uri LJLJI(Uri uri) {
        return this.LIZ.LJLJI(uri);
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final Class<? extends Activity> LJLJJI(String str) {
        return this.LIZ.LJLJJI(str);
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final String getCustomScheme() {
        return this.LIZ.getCustomScheme();
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final boolean isAppHot() {
        return this.LIZ.isAppHot();
    }
}
