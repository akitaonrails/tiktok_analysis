package X;

import com.ss.android.ugc.aweme.effectcreator.models.CKEDraftInfo;

/* JADX INFO: renamed from: X.0vIG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1736660vIG {
    public static final String LIZIZ(CKEDraftInfo cKEDraftInfo) {
        return C08QA.LJIL(new C0VSJ(cKEDraftInfo.getDraftPath()), cKEDraftInfo.getEffectPath()).getAbsolutePath();
    }

    public static final String LIZJ(CKEDraftInfo cKEDraftInfo) {
        String iconPath = cKEDraftInfo.getIconPath();
        if (iconPath.length() == 0) {
            iconPath = cKEDraftInfo.getDefaultIconPath();
        }
        return C08QA.LJIL(new C0VSJ(cKEDraftInfo.getDraftPath()), iconPath).getAbsolutePath();
    }

    public static final String LIZ(CKEDraftInfo cKEDraftInfo, boolean z) {
        String iconPath;
        String absolutePath;
        if (z) {
            iconPath = cKEDraftInfo.getIconInfo().getPrimaryIconData().getIconPath();
        } else {
            iconPath = cKEDraftInfo.getIconInfo().getSecondaryIconData().getIconPath();
        }
        String placeholderIconPath = cKEDraftInfo.getIconInfo().getPlaceholderIconPath();
        if (C123100dR.LIZ(iconPath)) {
            absolutePath = C08QA.LJIL(new C0VSJ(cKEDraftInfo.getDraftPath()), iconPath).getAbsolutePath();
        } else if (C123100dR.LIZ(placeholderIconPath)) {
            absolutePath = C08QA.LJIL(new C0VSJ(cKEDraftInfo.getDraftPath()), placeholderIconPath).getAbsolutePath();
        } else {
            absolutePath = "";
        }
        if (!C123100dR.LIZ(absolutePath) || absolutePath == null) {
            return LIZJ(cKEDraftInfo);
        }
        return absolutePath;
    }
}
