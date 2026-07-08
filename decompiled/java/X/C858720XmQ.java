package X;

import com.ss.android.ugc.aweme.creative.model.publish.AVTextExtraStruct;
import com.ss.android.ugc.aweme.model.TextExtraStruct;

/* JADX INFO: renamed from: X.0XmQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C858720XmQ implements InterfaceC19882712qn<TextExtraStruct, AVTextExtraStruct> {
    @Override // X.InterfaceC19882712qn
    public final AVTextExtraStruct apply(TextExtraStruct textExtraStruct) {
        TextExtraStruct textExtraStruct2 = textExtraStruct;
        AVTextExtraStruct aVTextExtraStruct = new AVTextExtraStruct();
        aVTextExtraStruct.cid = textExtraStruct2.getCid();
        aVTextExtraStruct.hashTagName = textExtraStruct2.getHashTagName();
        aVTextExtraStruct.userId = textExtraStruct2.getUserId();
        aVTextExtraStruct.atUserType = textExtraStruct2.getAtUserType();
        aVTextExtraStruct.type = textExtraStruct2.getType();
        aVTextExtraStruct.start = textExtraStruct2.getStart();
        aVTextExtraStruct.end = textExtraStruct2.getEnd();
        aVTextExtraStruct.awemeId = textExtraStruct2.getAwemeId();
        aVTextExtraStruct.subType = textExtraStruct2.getSubtype();
        aVTextExtraStruct.setSecUid(textExtraStruct2.getSecUid());
        return aVTextExtraStruct;
    }
}
