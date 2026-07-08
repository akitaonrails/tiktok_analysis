package X;

import com.bytedance.im.core.proto.ReferenceInfo;
import com.ss.android.ugc.aweme.im.lightinteract.impl.serviceimpl.LightInteractionManager;
import com.ss.android.ugc.aweme.im.message.template.component.AttachmentComponent;

/* JADX INFO: renamed from: X.0ZM7, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.lightinteract.impl.serviceimpl.LightInteractionManager", f = "LightInteractionManager.kt", l = {279}, m = "triggerLightInteractionAsync")
public final class C0ZM7 extends AbstractC23140094w {
    public Object LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public Object LLILZ;
    public ReferenceInfo LLILZIL;
    public AttachmentComponent LLILZLL;
    public Object LLIZ;
    public Object LLIZLLLIL;
    public C0YTK LLJ;
    public C879420Yei LLJI;
    public /* synthetic */ Object LLJIJIL;
    public final /* synthetic */ LightInteractionManager LLJILJIL;
    public int LLJILJILJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0ZM7(LightInteractionManager lightInteractionManager, InterfaceC1364105Vn<? super C0ZM7> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLJILJIL = lightInteractionManager;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LightInteractionManager@4bc5.triggerLightInteractionAsync$1");
        this.LLJIJIL = obj;
        this.LLJILJILJ |= Integer.MIN_VALUE;
        Object objLJJLI = this.LLJILJIL.LJJLI(null, null, null, null, null, null, null, null, null, this);
        C1C7U.LIZIZ("LightInteractionManager@4bc5.triggerLightInteractionAsync$1");
        return objLJJLI;
    }
}
