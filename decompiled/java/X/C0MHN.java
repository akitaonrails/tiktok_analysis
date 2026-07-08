package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.CelebrationData;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.optimization.ILayoutPreloadServiceForEditPage;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.io.Serializable;
import java.util.Collections;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0MHN, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.lightening.canvas.forward.onthisday.celebration.ForwardCelebrationEnvironment$goEditPage$1", f = "ForwardCelebrationEnvironment.kt", l = {236}, m = "invokeSuspend")
public final class C0MHN extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ AbstractC214814194y LLILLJJLI;
    public final /* synthetic */ ShortVideoContext LLILLL;
    public final /* synthetic */ VideoPublishEditModel LLILZ;
    public final /* synthetic */ C0MHP LLILZIL;
    public final /* synthetic */ Context LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0MHN(AbstractC214814194y abstractC214814194y, ShortVideoContext shortVideoContext, VideoPublishEditModel videoPublishEditModel, C0MHP c0mhp, Context context, InterfaceC1364105Vn<? super C0MHN> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = abstractC214814194y;
        this.LLILLL = shortVideoContext;
        this.LLILZ = videoPublishEditModel;
        this.LLILZIL = c0mhp;
        this.LLILZLL = context;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0MHN(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Integer numLJ;
        int iIntValue;
        Integer celebrationType;
        C1C7U.LIZ("ForwardCelebrationEnvironment@c138.goEditPage$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        Bundle extras = null;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C1DFB c1dfb = C0PEM.LIZJ;
            C0MHO c0mho = new C0MHO(this.LLILZLL, this.LLILZIL, this.LLILZ, null);
            this.LL = 1;
            if (C23250099c.LJI(this, c1dfb, c0mho) == objLJFF) {
                C1C7U.LIZIZ("ForwardCelebrationEnvironment@c138.goEditPage$1");
                return objLJFF;
            }
        }
        ILayoutPreloadServiceForEditPage iLayoutPreloadServiceForEditPage = (ILayoutPreloadServiceForEditPage) ServiceManager.get().getService(ILayoutPreloadServiceForEditPage.class);
        AbstractC214814194y abstractC214814194y = this.LLILLJJLI;
        ShortVideoContext shortVideoContext = this.LLILLL;
        if (shortVideoContext != null) {
            numLJ = C2286608xc.LJ(shortVideoContext.shootMode);
        } else {
            numLJ = null;
        }
        iLayoutPreloadServiceForEditPage.preloadLayoutFilesFromShootMode(abstractC214814194y, numLJ);
        C0MLE c0mle = C0MLE.LIZ;
        VideoPublishEditModel videoPublishEditModel = this.LLILZ;
        C0MHP c0mhp = this.LLILZIL;
        c0mle.getClass();
        C0MLE.LIZJ(videoPublishEditModel, c0mhp);
        this.LLILZ.setNleData(null);
        Intent intent = new Intent();
        VideoPublishEditModel videoPublishEditModel2 = this.LLILZ;
        ShortVideoContext shortVideoContext2 = this.LLILLL;
        C0MHP c0mhp2 = this.LLILZIL;
        Context context = this.LLILZLL;
        CreativeModel creativeModelLJIIIIZZ = videoPublishEditModel2.creativeModel;
        if (creativeModelLJIIIIZZ == null) {
            creativeModelLJIIIIZZ = C0MUK.LJIIIIZZ();
        }
        C0MUK.LJIIIZ(intent, creativeModelLJIIIIZZ);
        C537520L6g.LIZLLL(intent, videoPublishEditModel2.getCreativeInfo());
        C0MLE.LIZ(intent, shortVideoContext2, videoPublishEditModel2, c0mhp2);
        intent.putExtra("voice_volume", 0.0f);
        CelebrationData celebrationData = videoPublishEditModel2.creativeModel.celebrationData;
        if (celebrationData != null && (celebrationType = celebrationData.getCelebrationType()) != null) {
            iIntValue = celebrationType.intValue();
        } else {
            iIntValue = 0;
        }
        if (C0MQ1.LIZJ(iIntValue)) {
            AVChallenge aVChallenge = new AVChallenge();
            aVChallenge.challengeName = context.getString(2131833996);
            intent.putExtra("challenge", (Serializable) Collections.singletonList(aVChallenge));
        }
        new C1438570nXT("forward");
        try {
            extras = intent.getExtras();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        C1438570nXT.LJII(extras, this.LLILZ);
        C1660680tJi.LIZ().LJIILIIL(this.LLILZLL, intent);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ForwardCelebrationEnvironment@c138.goEditPage$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
