package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.UploadSingleSelectData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Kn6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C527900Kn6 {
    public static final Keva LIZ = Keva.getRepo("UploadSelectChoiceSP");

    public static boolean LIZ(String str) {
        UploadSingleSelectData uploadSingleSelectDataLIZ;
        UploadSingleSelectData uploadSingleSelectDataLIZ2;
        if (C527910Kn7.LIZ.contains(Integer.valueOf(C527910Kn7.LIZIZ)) && (((uploadSingleSelectDataLIZ = C527940KnA.LIZ()) != null && uploadSingleSelectDataLIZ.getUploadRememberLastChoice() && C527940KnA.LIZJ()) || ((uploadSingleSelectDataLIZ2 = C527940KnA.LIZ()) != null && uploadSingleSelectDataLIZ2.getUploadRememberLastChoiceNonStory() && C527940KnA.LIZIZ()))) {
            String string = "multiple";
            if (!Intrinsics.LJFF(str, "single_song") || C0C64.LJIILLIIL().LJIJ(31744, 0, "studio_single_or_multiple_selection_logic", true) != 2) {
                Keva keva = LIZ;
                if (C0C64.LJIILLIIL().LJIJ(31744, 0, "studio_single_or_multiple_selection_logic", true) < 1) {
                    string = "single";
                }
                string = keva.getString("storeLastChoice", string);
            }
            return Intrinsics.LJFF(string, "single");
        }
        return C527910Kn7.LIZIZ();
    }

    public static void LIZIZ(String str, boolean z) {
        String str2;
        if (Intrinsics.LJFF(str, "single_song") && C0C64.LJIILLIIL().LJIJ(31744, 0, "studio_single_or_multiple_selection_logic", true) == 2) {
            return;
        }
        Keva keva = LIZ;
        if (z) {
            str2 = "single";
        } else {
            str2 = "multiple";
        }
        keva.storeString("storeLastChoice", str2);
    }
}
