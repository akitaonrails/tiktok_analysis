package X;

import android.content.Context;
import com.bytedance.ies.nle.editor_jni.NLECollectionModel;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0F3o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C383940F3o {
    public final NLECollectionModel LIZ;
    public final C389400FOo LIZIZ;
    public final ArrayList<MediaModel> LIZJ;
    public final ArrayList<MediaModel> LIZLLL;
    public final ShortVideoContext LJ;
    public final Context LJFF;

    public static void LIZ(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PhotoModeTemplateConsumer not found ep model in cache:  ");
        sbLIZ.append(str);
        C201955140j.LJIIZILJ(C2188811AlT.LIZIZ(sbLIZ));
    }

    public C383940F3o(NLECollectionModel nLECollectionModel, C389400FOo c389400FOo, ArrayList arrayList, ArrayList arrayList2, ShortVideoContext shortVideoContext, C19EG c19eg) {
        this.LIZ = nLECollectionModel;
        this.LIZIZ = c389400FOo;
        this.LIZJ = arrayList;
        this.LIZLLL = arrayList2;
        this.LJ = shortVideoContext;
        this.LJFF = c19eg;
    }
}
