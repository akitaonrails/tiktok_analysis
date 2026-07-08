package X;

import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.EditorProAIGCMediaItemModel;

/* JADX INFO: renamed from: X.0Esi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C378500Esi implements InterfaceC1410340mnw {
    @Override // X.InterfaceC1410340mnw
    public final String getTag() {
        return "EditorProAIGCFieldsBuilder";
    }

    public static int LIZIZ(EditorProAIGCMediaItemModel editorProAIGCMediaItemModel) {
        int size = editorProAIGCMediaItemModel.param.imagePathList.size();
        if (size <= 0) {
            if (editorProAIGCMediaItemModel.param.imagePath.length() > 0) {
                return 1;
            }
            return 0;
        }
        return size;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00d6  */
    @Override // X.InterfaceC1410340mnw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Map<java.lang.String, java.lang.String> LIZ(X.C1410370mnz r10) {
        /*
            Method dump skipped, instruction units count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C378500Esi.LIZ(X.0mnz):java.util.Map");
    }
}
