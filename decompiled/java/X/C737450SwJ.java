package X;

import android.content.Context;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.LiveData;
import com.bytedance.router.OnActivityResultCallback;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.InteractionTagUserInfo;
import com.ss.android.ugc.aweme.tag.service.ITagService;
import com.ss.android.ugc.aweme.tag.service.TagServiceImpl;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0SwJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C737450SwJ implements ITagService {
    public static final C737450SwJ LIZIZ = new C737450SwJ();
    public final /* synthetic */ ITagService LIZ;

    @Override // com.ss.android.ugc.aweme.tag.service.ITagService
    public final void LIZ() {
        this.LIZ.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.tag.service.ITagService
    public final int LIZIZ() {
        return this.LIZ.LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.tag.service.ITagService
    public final void LIZJ(Context context, String str, Aweme aweme, int i, List<InteractionTagUserInfo> list, OnActivityResultCallback onActivityResultCallback) {
        this.LIZ.LIZJ(context, str, aweme, i, list, onActivityResultCallback);
    }

    @Override // com.ss.android.ugc.aweme.tag.service.ITagService
    public final void LIZLLL(C19EG c19eg, String str, Aweme aweme, int i, List<InteractionTagUserInfo> list, InterfaceC1631620sYq<? super List<InteractionTagUserInfo>, ? super Boolean, ? super Boolean, Unit> interfaceC1631620sYq) {
        this.LIZ.LIZLLL(c19eg, str, aweme, i, list, interfaceC1631620sYq);
    }

    @Override // com.ss.android.ugc.aweme.tag.service.ITagService
    public final LiveData LJ(LifecycleRegistry lifecycleRegistry) {
        return this.LIZ.LJ(lifecycleRegistry);
    }

    @Override // com.ss.android.ugc.aweme.tag.service.ITagService
    public final void LJFF(C19EG c19eg, boolean z, Function0<Unit> function0) {
        this.LIZ.LJFF(c19eg, z, function0);
    }

    @Override // com.ss.android.ugc.aweme.tag.service.ITagService
    public final void LJI(C19EG c19eg, Aweme aweme, String str, String str2) {
        this.LIZ.LJI(c19eg, aweme, str, str2);
    }

    @Override // com.ss.android.ugc.aweme.tag.service.ITagService
    public final C11VD LJII() {
        return this.LIZ.LJII();
    }

    public C737450SwJ() {
        ITagService iTagService;
        Object objLIZ = C04TD.LIZ(ITagService.class, false);
        if (objLIZ != null) {
            iTagService = (ITagService) objLIZ;
        } else {
            if (C04TD.I5 == null) {
                synchronized (ITagService.class) {
                    if (C04TD.I5 == null) {
                        C04TD.I5 = new TagServiceImpl();
                    }
                }
            }
            iTagService = C04TD.I5;
        }
        this.LIZ = iTagService;
    }
}
