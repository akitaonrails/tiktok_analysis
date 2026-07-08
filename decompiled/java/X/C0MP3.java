package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.CreativeInitialModel;
import com.ss.android.ugc.aweme.creative.model.photomode.PhotoModeDefaultMusicModel;
import com.ss.android.ugc.aweme.creative.model.photomode.PhotoModePostContentModel;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.ugc.aweme.CreationConfigModel;
import com.ss.ugc.aweme.creation.base.BasicModel;
import com.ss.ugc.aweme.creation.base.TrackModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.a0;
import njp.a;

/* JADX INFO: renamed from: X.0MP3, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tangram.parser.CreationConfigModelParser$launchEditPage$2", f = "CreationConfigModelParser.kt", l = {67}, m = "invokeSuspend")
public final class C0MP3 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ C0MTW LLILLL;
    public final /* synthetic */ CreationConfigModel LLILZ;
    public final /* synthetic */ InterfaceC569070MTp LLILZIL;
    public final /* synthetic */ Context LLILZLL;
    public final /* synthetic */ VideoPublishEditModel LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0MP3(boolean z, C0MTW c0mtw, CreationConfigModel creationConfigModel, InterfaceC569070MTp interfaceC569070MTp, Context context, VideoPublishEditModel videoPublishEditModel, InterfaceC1364105Vn<? super C0MP3> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = z;
        this.LLILLL = c0mtw;
        this.LLILZ = creationConfigModel;
        this.LLILZIL = interfaceC569070MTp;
        this.LLILZLL = context;
        this.LLIZ = videoPublishEditModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0MP3(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        String shootWay;
        boolean z2;
        C19EG c19eg;
        Bundle bundle;
        Object objLJIJ;
        List<String> challenges;
        TrackModel track;
        C1C7U.LIZ("CreationConfigModelParser@def.launchEditPage$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            if (this.LLILLJJLI) {
                C0MTW c0mtw = this.LLILLL;
                CreationConfigModel creationConfigModel = this.LLILZ;
                InterfaceC569070MTp interfaceC569070MTp = this.LLILZIL;
                Context context = this.LLILZLL;
                VideoPublishEditModel videoPublishEditModel = this.LLIZ;
                this.LL = 1;
                c0mtw.getClass();
                Intent intent = new Intent();
                C580250MpL.LIZ(intent, videoPublishEditModel, false);
                ArrayList<? extends Parcelable> arrayList = (ArrayList) interfaceC569070MTp.get("photomode_composer");
                if (arrayList != null && !arrayList.isEmpty()) {
                    z = false;
                } else {
                    z = true;
                }
                if (!z) {
                    intent.putParcelableArrayListExtra("extra_image_model_media_list", arrayList);
                }
                BasicModel basic = creationConfigModel.getBasic();
                ArrayList arrayListLIZ = null;
                if (basic != null && (track = basic.getTrack()) != null) {
                    shootWay = track.getShootWay();
                } else {
                    shootWay = null;
                }
                if (shootWay != null && !a0.LJJJIL(shootWay)) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (!z2) {
                    intent.putExtra("shoot_way", shootWay);
                }
                if (context instanceof C19EG) {
                    c19eg = (C19EG) context;
                } else {
                    c19eg = null;
                }
                if (c19eg == null) {
                    C1660680tJi.LIZ().LJIJI(context, intent);
                    objLJIJ = Unit.LIZ;
                } else {
                    try {
                        bundle = intent.getExtras();
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        bundle = null;
                    }
                    if (bundle == null) {
                        bundle = new Bundle();
                    }
                    ShortVideoContext shortVideoContextLIZIZ = C1443540nfU.LIZIZ(bundle);
                    shortVideoContextLIZIZ.creativeModel = videoPublishEditModel.creativeModel;
                    C1443030nef c1443030nefLJII = C1443030nef.LJII();
                    String str = shortVideoContextLIZIZ.shootWay;
                    c1443030nefLJII.LIZIZ = str;
                    c1443030nefLJII.LIZJ = str;
                    C1443030nef.LJII().LIZLLL = shortVideoContextLIZIZ.mShootFrom;
                    MusicModel musicModelLJII = C0CHQ.LIZ().LJJJJL().LJII(MusicBeanUtilKt.extractAVMusic(shortVideoContextLIZIZ.creativeModel.musicBuzModel));
                    if (musicModelLJII != null) {
                        CreativeInitialModel creativeInitialModel = shortVideoContextLIZIZ.creativeModel.initialModel;
                        PhotoModeDefaultMusicModel photoModeDefaultMusicModel = new PhotoModeDefaultMusicModel(musicModelLJII, videoPublishEditModel.getMMusicPath());
                        BasicModel basic2 = creationConfigModel.getBasic();
                        if (basic2 != null && (challenges = basic2.getChallenges()) != null) {
                            arrayListLIZ = C09HN.LIZ(challenges);
                        }
                        creativeInitialModel.photoModePostContentModel = new PhotoModePostContentModel("", "", 0, arrayListLIZ, null, photoModeDefaultMusicModel);
                    }
                    ArrayList arrayList2 = (ArrayList) interfaceC569070MTp.get("photomode_composer");
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    final C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(this));
                    c2252611DEt.LJIJJ();
                    C573020Mdg c573020Mdg = new C573020Mdg(c19eg, false, false);
                    ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(arrayList2, 10));
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        arrayList3.add(((MediaModel) it2.next()).LJFF());
                    }
                    C573020Mdg.LJIIIIZZ(c573020Mdg, shortVideoContextLIZIZ, arrayList3, new InterfaceC573150Mdt() { // from class: X.0MP5
                        @Override // X.InterfaceC573150Mdt
                        public final void onFinish(boolean z3) {
                            C0MP6.LIZ(Unit.LIZ, c2252611DEt);
                        }
                    }, false, null, C2286608xc.LJFF(System.currentTimeMillis()), false, arrayList2, null, null, null, null, 15872);
                    objLJIJ = c2252611DEt.LJIJ();
                    if (objLJIJ == C099R.LJFF()) {
                        C099Q.LIZJ(this);
                    }
                    if (objLJIJ != C099R.LJFF()) {
                        objLJIJ = Unit.LIZ;
                    }
                }
                if (objLJIJ == objLJFF) {
                    C1C7U.LIZIZ("CreationConfigModelParser@def.launchEditPage$2");
                    return objLJFF;
                }
            } else {
                VideoPublishEditModel videoPublishEditModel2 = this.LLIZ;
                Intent intent2 = new Intent();
                C580250MpL.LIZ(intent2, videoPublishEditModel2, false);
                C1660680tJi.LIZ().LJIILIIL(this.LLILZLL, intent2);
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CreationConfigModelParser@def.launchEditPage$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
