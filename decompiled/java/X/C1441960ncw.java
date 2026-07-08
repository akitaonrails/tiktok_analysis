package X;

import kotlin.jvm.internal.AFwS190S0000000_4;

/* JADX INFO: renamed from: X.0ncw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1441960ncw {
    public static int LIZ;
    public static int LIZIZ;
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(1436));

    public static final boolean LIZ() {
        if (LIZIZ == 2) {
            return true;
        }
        int i = LIZ;
        if (i == 0) {
            return ((Boolean) LIZJ.getValue()).booleanValue();
        }
        if (i == 1) {
            return false;
        }
        if (i != 2) {
            return ((Boolean) LIZJ.getValue()).booleanValue();
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZIZ(android.content.Context r5, com.ss.android.ugc.aweme.creative.model.CreativeModel r6) {
        /*
            boolean r0 = r6.isFromEditTab
            r3 = 1
            r2 = 2
            r4 = 0
            if (r0 == 0) goto L21
            com.ss.android.ugc.aweme.creative.model.CreativeFlowData r0 = r6.creativeFlowData
            com.ss.android.ugc.aweme.creative.model.editorpro.EditorProModel r0 = r0.getEditorProModel()
            if (r0 == 0) goto L71
            java.lang.String r1 = r0.getOpenEditToolType()
        L13:
            java.lang.String r0 = "photo_editor"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L21
            com.ss.android.ugc.aweme.creative.model.creation.CreationTypeModel r0 = r6.creationTypeModel
            int r0 = r0.creationMode
            if (r0 == r2) goto L3e
        L21:
            X.01GW r0 = X.C259310AEf.LIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L6f
            android.content.res.Resources r0 = r5.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r0 = r0.screenLayout
            r1 = r0 & 15
            r0 = 3
            if (r1 < r0) goto L6f
        L3e:
            r0 = 2
        L3f:
            X.C1441960ncw.LIZIZ = r0
            com.ss.android.ugc.aweme.creative.model.draft.DraftInfoModel r0 = r6.draftInfoModel
            boolean r0 = r0.isDraft
            if (r0 != 0) goto L5c
            X.01GW r0 = X.C1441960ncw.LIZJ
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L67
            com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData r0 = r6.imageAlbumModel
            if (r0 == 0) goto L5c
            r0.setSupportDoNotAutoCut(r2)
        L5c:
            com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData r0 = r6.imageAlbumModel
            if (r0 == 0) goto L64
            int r4 = r0.getSupportDoNotAutoCut()
        L64:
            X.C1441960ncw.LIZ = r4
            return
        L67:
            com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData r0 = r6.imageAlbumModel
            if (r0 == 0) goto L5c
            r0.setSupportDoNotAutoCut(r3)
            goto L5c
        L6f:
            r0 = 0
            goto L3f
        L71:
            r1 = 0
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1441960ncw.LIZIZ(android.content.Context, com.ss.android.ugc.aweme.creative.model.CreativeModel):void");
    }
}
