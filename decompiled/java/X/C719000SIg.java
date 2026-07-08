package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.tux.business.richtext.IRichTextService;

/* JADX INFO: renamed from: X.0SIg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C719000SIg {
    public final TextExtraStruct LIZ;

    public final boolean LIZ() {
        if (this.LIZ.getStart() < 0 || this.LIZ.getEnd() < 0 || this.LIZ.getStart() > this.LIZ.getEnd()) {
            return false;
        }
        IRichTextService iRichTextService = (IRichTextService) PluggableExtentionKt.pluggableSpi$default(IRichTextService.class, false, false, false, 14, null);
        if (iRichTextService == null) {
            return true;
        }
        iRichTextService.LIZ();
        return true;
    }

    public C719000SIg(TextExtraStruct textExtraStruct) {
        this.LIZ = textExtraStruct;
    }
}
