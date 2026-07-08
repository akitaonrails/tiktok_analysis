package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.services.storage.AVStorageManagerImpl;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1Drw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2269261Drw extends C09AY implements Function0<C2269271Drx> {
    public C2269261Drw() {
        super(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [X.0Mox] */
    @Override // kotlin.jvm.functions.Function0
    public final C2269271Drx invoke() {
        C2269271Drx c2269271Drx = new C2269271Drx();
        AVStorageManagerImpl aVStorageManagerImpl = new AVStorageManagerImpl();
        if (!c2269271Drx.LIZIZ.get()) {
            c2269271Drx.LIZIZ.set(true);
            c2269271Drx.LIZ = aVStorageManagerImpl;
            if (C0C64.LJIILLIIL().LJIIIZ(31744, "studio_editor_pro_optimize_keva_anr", true, true)) {
                Keva.getRepo("EditorProKeva");
                Keva.getRepo("edit_merge_music_prompt");
                Keva.getRepo("edit_effect_keva");
                Keva.getRepo("ai_music");
                Keva.getRepo("edit_lyric_keva");
            }
            InterfaceC2269281Dry interfaceC2269281Dry = c2269271Drx.LIZ;
            if (interfaceC2269281Dry == null) {
                interfaceC2269281Dry = null;
            }
            interfaceC2269281Dry.getPersistedAllowListManager().LIZIZ(new AbstractC579990Mov() { // from class: X.0Mox
            });
            C0CHQ.LIZ().LJI().LIZ().registerListener(c2269271Drx.getAllowListService());
        }
        return c2269271Drx;
    }
}
