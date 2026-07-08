package X;

import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.PropFromGroupModel;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.07gZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public /* synthetic */ class C1926107gZ extends C2217421BqW implements Function1<CreativeModel, C07TQ> {
    public C1926107gZ(C07TR c07tr) {
        super(1, c07tr, C07TR.class, "create", "create(Lcom/ss/android/ugc/aweme/creative/model/CreativeModel;)Lcom/ss/android/ugc/tiktok/eventtracking/group/PropFromParamGroup;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final C07TQ invoke(CreativeModel creativeModel) {
        this.receiver.getClass();
        PropFromGroupModel propFromGroupModel = creativeModel.propFromGroupModel;
        return new C07TQ(propFromGroupModel.fromPropId, propFromGroupModel.fromPropResourceId);
    }
}
