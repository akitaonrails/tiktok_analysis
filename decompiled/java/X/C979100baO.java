package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.playentity.SharedBackgroundEntity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0baO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final /* synthetic */ class C979100baO extends C2217421BqW implements Function1<String, Unit> {
    public C979100baO(AbstractC20356314kz abstractC20356314kz) {
        super(1, abstractC20356314kz, SharedBackgroundEntity.class, "onEntityFail", "onEntityFail(Ljava/lang/String;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        String str2 = str;
        SharedBackgroundEntity sharedBackgroundEntity = (SharedBackgroundEntity) this.receiver;
        sharedBackgroundEntity.getClass();
        if (Intrinsics.LJFF(str2, "has_params")) {
            C766270U4b.LIZLLL(2131854098);
        } else {
            String str3 = sharedBackgroundEntity.LLJJJJJIL.LIZ;
            if (str2 == null) {
                str2 = "";
            }
            C01N8.LIZ(-1, "entity_ready_to_start", str3, 0L, "anchor", str2, "");
        }
        return Unit.LIZ;
    }
}
