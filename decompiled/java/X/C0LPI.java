package X;

import android.content.Context;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.aigc.IMService;
import com.ss.android.ugc.aweme.creative.model.aigc.AIGCSocialModel;
import com.ss.android.ugc.aweme.creative.model.common.MentionDataItem;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS552S0100000_8;

/* JADX INFO: renamed from: X.0LPI, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0LPI {
    public static final C0LPI LIZ = new C0LPI();

    public static IMService LIZ() {
        return (IMService) C547350LdN.LIZIZ(PluggableExtentionKt.pluggableSpi$default(IMService.class, false, false, false, 14, null), "im", new IMService() { // from class: X.0LPf
            public static final MutableLiveData LIZIZ = new MutableLiveData(C13BV.INSTANCE);
            public static final MutableLiveData LIZJ = new MutableLiveData();

            @Override // com.ss.android.ugc.aweme.aigc.IMService
            public final void LIZ(Context context, Long l, String str) {
            }

            @Override // com.ss.android.ugc.aweme.aigc.IMService
            public final void LIZIZ(Context context, AIGCSocialModel aIGCSocialModel, C21350518gx c21350518gx, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03) {
            }

            @Override // com.ss.android.ugc.aweme.aigc.IMService
            public final void LIZJ(C19EG c19eg, AIGCSocialModel aIGCSocialModel, C21350518gx c21350518gx, AwS552S0100000_8 awS552S0100000_8, AwS552S0100000_8 awS552S0100000_82, AwS552S0100000_8 awS552S0100000_83) {
            }

            @Override // com.ss.android.ugc.aweme.aigc.IMService
            public final MutableLiveData LJ() {
                return LIZIZ;
            }

            @Override // com.ss.android.ugc.aweme.aigc.IMService
            public final MutableLiveData LJFF() {
                return LIZJ;
            }

            @Override // com.ss.android.ugc.aweme.aigc.IMService
            public final Object LIZLLL(long j, String str, InterfaceC1364105Vn<? super Pair<? extends List<MentionDataItem>, Boolean>> interfaceC1364105Vn) {
                return new Pair(C13BV.INSTANCE, null);
            }
        });
    }
}
