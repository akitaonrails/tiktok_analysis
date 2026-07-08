package X;

import com.ss.android.ugc.aweme.creative.model.LandingModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0MyS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C585900MyS {
    public static final void LIZ(LandingModel landingModel, String str) {
        if (str != null && str.length() != 0) {
            landingModel.isFromExternalLink = Boolean.valueOf(!Intrinsics.LJFF(EnumC585890MyR.SCHEMA_TAG_DRAFT_BOX.getTagVal(), str));
        } else {
            landingModel.isFromExternalLink = Boolean.FALSE;
        }
    }
}
