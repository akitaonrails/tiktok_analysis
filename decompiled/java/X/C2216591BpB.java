package X;

import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.edit.EditEffectModel;

/* JADX INFO: renamed from: X.1BpB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final /* synthetic */ class C2216591BpB extends C2217371BqR {
    public static final C2216591BpB LL = new C2216591BpB();

    public C2216591BpB() {
        super(CreativeModel.class, "editEffectModel", "getEditEffectModel()Lcom/ss/android/ugc/aweme/creative/model/edit/EditEffectModel;", 0);
    }

    @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
    public final Object get(Object obj) {
        return ((CreativeModel) obj).editEffectModel;
    }

    @Override // X.C2217371BqR, X.AbstractC2217331BqN
    public final void set(Object obj, Object obj2) {
        ((CreativeModel) obj).editEffectModel = (EditEffectModel) obj2;
    }
}
