package X;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.api.IMentionVideoApi;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.service.MentionVideoService;
import java.util.List;

/* JADX INFO: renamed from: X.11VF, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11VF implements IMentionVideoApi {
    public static final C11VF LIZIZ = new C11VF();
    public final /* synthetic */ IMentionVideoApi LIZ;

    @Override // com.ss.android.ugc.aweme.api.IMentionVideoApi
    public final boolean LIZ(int i) {
        return this.LIZ.LIZ(i);
    }

    @Override // com.ss.android.ugc.aweme.api.IMentionVideoApi
    public final void LIZIZ(C19EG c19eg, C1442910neT c1442910neT) {
        this.LIZ.LIZIZ(c19eg, c1442910neT);
    }

    @Override // com.ss.android.ugc.aweme.api.IMentionVideoApi
    public final Fragment LIZJ() {
        return this.LIZ.LIZJ();
    }

    @Override // com.ss.android.ugc.aweme.api.IMentionVideoApi
    public final boolean LIZLLL(TextExtraStruct textExtraStruct) {
        return this.LIZ.LIZLLL(textExtraStruct);
    }

    @Override // com.ss.android.ugc.aweme.api.IMentionVideoApi
    public final boolean LJ(TextExtraStruct textExtraStruct) {
        return this.LIZ.LJ(textExtraStruct);
    }

    @Override // com.ss.android.ugc.aweme.api.IMentionVideoApi
    public final void LJFF(Activity activity, String str) {
        this.LIZ.LJFF(activity, str);
    }

    @Override // com.ss.android.ugc.aweme.api.IMentionVideoApi
    public final List<Aweme> LJI(String str) {
        return this.LIZ.LJI(str);
    }

    @Override // com.ss.android.ugc.aweme.api.IMentionVideoApi
    public final void LJII(String str) {
        this.LIZ.LJII(str);
    }

    @Override // com.ss.android.ugc.aweme.api.IMentionVideoApi
    public final boolean LJIIIIZZ(int i) {
        return this.LIZ.LJIIIIZZ(i);
    }

    @Override // com.ss.android.ugc.aweme.api.IMentionVideoApi
    public final Fragment LJIIIZ(int i) {
        return this.LIZ.LJIIIZ(i);
    }

    @Override // com.ss.android.ugc.aweme.api.IMentionVideoApi
    public final void LJIIJ() {
        this.LIZ.LJIIJ();
    }

    @Override // com.ss.android.ugc.aweme.api.IMentionVideoApi
    public final Fragment LJIIJJI(String str, String str2) {
        return this.LIZ.LJIIJJI(str, str2);
    }

    @Override // com.ss.android.ugc.aweme.api.IMentionVideoApi
    public final String LJIIL(int i) {
        return this.LIZ.LJIIL(i);
    }

    @Override // com.ss.android.ugc.aweme.api.IMentionVideoApi
    public final void LJIILIIL(Fragment fragment) {
        this.LIZ.LJIILIIL(fragment);
    }

    @Override // com.ss.android.ugc.aweme.api.IMentionVideoApi
    public final void setCreationId(String str) {
        this.LIZ.setCreationId(str);
    }

    public C11VF() {
        IMentionVideoApi iMentionVideoApi;
        Object objLIZ = C04TD.LIZ(IMentionVideoApi.class, false);
        if (objLIZ != null) {
            iMentionVideoApi = (IMentionVideoApi) objLIZ;
        } else {
            if (C04TD.d4 == null) {
                synchronized (IMentionVideoApi.class) {
                    if (C04TD.d4 == null) {
                        C04TD.d4 = new MentionVideoService();
                    }
                }
            }
            iMentionVideoApi = C04TD.d4;
        }
        this.LIZ = iMentionVideoApi;
    }
}
