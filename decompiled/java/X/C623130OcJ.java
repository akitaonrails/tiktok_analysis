package X;

import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0OcJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C623130OcJ implements C0NBA {
    public final /* synthetic */ BaseSharePackage LIZ;
    public final /* synthetic */ String LIZIZ;
    public final /* synthetic */ String LIZJ;

    public C623130OcJ(BaseSharePackage baseSharePackage, String str, String str2) {
        this.LIZ = baseSharePackage;
        this.LIZIZ = str;
        this.LIZJ = str2;
    }

    @Override // X.C0NBA
    public final void LIZ(C0NBB c0nbb) throws JSONException {
        String string = this.LIZ.extras.getString("enter_from");
        String str = "";
        if (string == null) {
            string = "";
        }
        c0nbb.LIZ("enter_from", string);
        String str2 = this.LIZIZ;
        if (str2 != null) {
            str = str2;
        }
        c0nbb.LIZ("group_id", str);
        c0nbb.LIZ("action_type", "click");
        c0nbb.LIZ("enter_method", this.LIZJ);
    }
}
