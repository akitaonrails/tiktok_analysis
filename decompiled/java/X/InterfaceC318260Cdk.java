package X;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.ss.android.ugc.aweme.effectcreator.models.CKEDraftExtraInfo;
import com.ss.android.ugc.aweme.effectcreator.models.CKEDraftInfo;
import com.ss.android.ugc.aweme.effectcreator.models.EffectPackageDataWrapper;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Cdk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public interface InterfaceC318260Cdk extends InterfaceC1172704iL {
    void LIZ(Context context, CKEDraftInfo cKEDraftInfo, CKEDraftExtraInfo cKEDraftExtraInfo);

    Cursor LIZIZ(Uri uri, String str, Context context);

    Object LIZJ(Context context, String str, InterfaceC1364105Vn<? super EffectPackageDataWrapper> interfaceC1364105Vn);

    void LIZLLL(Context context, String str, Function1<? super CKEDraftInfo, Unit> function1);

    Cursor LJ(Context context, String[] strArr);

    CKEDraftInfo LJFF(Context context, String str);

    void LJI(Context context, CKEDraftInfo cKEDraftInfo, CKEDraftExtraInfo cKEDraftExtraInfo);

    List<CKEDraftInfo> LJII(Context context);

    void LJIIIIZZ(Context context, String str);

    Unit LJIIIZ(CKEDraftInfo cKEDraftInfo);

    InterfaceC318140CdY LJIIJ();

    void LJIIJJI(Context context, String str);

    JSONObject LJIIL(CKEDraftInfo cKEDraftInfo);

    String LJIILIIL(Context context, String str);

    CKEDraftInfo LJIILJJIL(Context context, String str);

    void LJIILL(Context context, String str, String str2);

    @Override // X.InterfaceC1172704iL
    /* synthetic */ void onEvent(InterfaceC1172804iM interfaceC1172804iM);
}
