package X;

import com.ss.android.ugc.aweme.creative.model.editorpro.EPAnchorData;
import com.ss.android.ugc.aweme.creative.model.editorpro.EditorProSchemeModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0L7z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C537970L7z {
    public static final String LIZ(EditorProSchemeModel editorProSchemeModel) {
        EPAnchorData ePAnchorData;
        if (editorProSchemeModel != null && (ePAnchorData = editorProSchemeModel.anchorData) != null) {
            return ePAnchorData.editorProAnchorType;
        }
        return null;
    }

    public static final boolean LIZIZ(EditorProSchemeModel editorProSchemeModel) {
        if (editorProSchemeModel == null || editorProSchemeModel.anchorData == null) {
            return false;
        }
        return true;
    }

    public static final boolean LIZJ(EditorProSchemeModel editorProSchemeModel) {
        String str;
        if (editorProSchemeModel == null) {
            return false;
        }
        EPAnchorData ePAnchorData = editorProSchemeModel.anchorData;
        if (ePAnchorData != null) {
            str = ePAnchorData.editorProAnchorType;
        } else {
            str = null;
        }
        return Intrinsics.LJFF(str, "captions");
    }

    public static final boolean LIZLLL(EditorProSchemeModel editorProSchemeModel) {
        EPAnchorData ePAnchorData;
        if (editorProSchemeModel == null || (ePAnchorData = editorProSchemeModel.anchorData) == null || ePAnchorData.lyricAnchor == null) {
            return false;
        }
        return true;
    }

    public static final boolean LJ(EditorProSchemeModel editorProSchemeModel) {
        String str;
        if (editorProSchemeModel == null) {
            return false;
        }
        EPAnchorData ePAnchorData = editorProSchemeModel.anchorData;
        if (ePAnchorData != null) {
            str = ePAnchorData.editorProAnchorType;
        } else {
            str = null;
        }
        return Intrinsics.LJFF(str, "magic");
    }

    public static final boolean LJFF(EditorProSchemeModel editorProSchemeModel) {
        if (editorProSchemeModel == null || editorProSchemeModel.scene == null) {
            return false;
        }
        return true;
    }

    public static final boolean LJI(EditorProSchemeModel editorProSchemeModel) {
        if (editorProSchemeModel == null || editorProSchemeModel.scene == null) {
            return false;
        }
        return !LIZLLL(editorProSchemeModel);
    }
}
