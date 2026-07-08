package X;

import Y.AfS171S0100000_2;
import android.app.Activity;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01lc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.avatar.ChangAvatarActionStage$loadMusic$2$1$1", f = "ChangAvatarActionStage.kt", l = {}, m = "invokeSuspend")
public final class C428601lc extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Activity LL;
    public final /* synthetic */ VideoPublishEditModel LLILLJJLI;
    public final /* synthetic */ InterfaceC1364105Vn<Boolean> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C428601lc(Activity activity, VideoPublishEditModel videoPublishEditModel, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn, InterfaceC1364105Vn<? super C428601lc> interfaceC1364105Vn2) {
        super(2, interfaceC1364105Vn2);
        this.LL = activity;
        this.LLILLJJLI = videoPublishEditModel;
        this.LLILLL = interfaceC1364105Vn;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C428601lc(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ChangAvatarActionStage@89ff.loadMusic$2$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1458080o2w c1458080o2w = new C1458080o2w();
        c1458080o2w.LJ(this.LL, this.LLILLJJLI, 0L, this.LL);
        final VideoPublishEditModel videoPublishEditModel = this.LLILLJJLI;
        final InterfaceC1364105Vn<Boolean> interfaceC1364105Vn = this.LLILLL;
        C1458080o2w.LJI(c1458080o2w, null, new InterfaceC1455230nyL() { // from class: X.0EMZ
            @Override // X.InterfaceC1455230nyL
            public final MusicBuzModel LIZIZ() {
                return videoPublishEditModel.creativeModel.musicBuzModel;
            }

            @Override // X.InterfaceC1455230nyL
            public final void LIZ(AVMusic aVMusic) {
                String str;
                C1452640nuA.LJII(aVMusic, false, videoPublishEditModel.creativeModel.musicBuzModel);
                VideoPublishEditModel videoPublishEditModel2 = videoPublishEditModel;
                if (aVMusic != null) {
                    str = aVMusic.path;
                } else {
                    str = null;
                }
                videoPublishEditModel2.setMMusicPath(str);
                videoPublishEditModel.setMusicVolume(1.0f);
                videoPublishEditModel.setMusicOrigin("profile_photo");
                InterfaceC1364105Vn<Boolean> interfaceC1364105Vn2 = interfaceC1364105Vn;
                Boolean bool = Boolean.TRUE;
                C189200o6.m2constructorimpl(bool);
                interfaceC1364105Vn2.resumeWith(bool);
            }
        }, false, false, false, null, 252).LJJLL(new AfS171S0100000_2(this.LLILLJJLI, 31), new C516201zk(this.LLILLL, 160));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ChangAvatarActionStage@89ff.loadMusic$2$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
