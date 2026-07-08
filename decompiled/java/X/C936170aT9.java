package X;

import Y.AfS184S0100000_15;
import Y.AfS4S0100100_12;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.avatar.common.api.IAvatarAPI;
import com.bytedance.android.live.liveinteract.multilive.social.model.AvatarCreateReq;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS594S0100000_15;
import kotlin.jvm.internal.Intrinsics;
import webcast.data.multi_guest_social_data.Avatar;

/* JADX INFO: renamed from: X.0aT9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C936170aT9 {
    public static final /* synthetic */ int LJIIJJI = 0;
    public final long LIZ;
    public Function1<? super Function1<? super String, Unit>, Unit> LIZIZ;
    public final int LIZJ;
    public C09AJ<C936030aSv> LIZLLL;
    public volatile boolean LJ;
    public volatile Long LJFF;
    public String LJI;
    public String LJII;
    public Avatar LJIIIIZZ;
    public boolean LJIIIZ;
    public final MutableLiveData<C936030aSv> LJIIJ = new MutableLiveData<>(null);

    /* JADX WARN: Type inference failed for: r1v3, types: [X.0aTP, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v0, types: [X.0aTA] */
    public final void LIZLLL() {
        if (this.LJ) {
            return;
        }
        String str = this.LJII;
        if (str == null) {
            C09AJ<C936030aSv> c09aj = this.LIZLLL;
            if (c09aj != null) {
                c09aj.onNext(new C936030aSv(this, EnumC935940aSm.STATE_FAILED, 0, null, "generate_fail"));
            }
            C09AJ<C936030aSv> c09aj2 = this.LIZLLL;
            if (c09aj2 != null) {
                c09aj2.onComplete();
                return;
            }
            return;
        }
        C20441214yg.LIZIZ("GenerateTask", "startCreateAvatar");
        boolean z = C936250aTH.LIZIZ;
        long j = this.LIZ;
        ?? r9 = new InterfaceC936350aTR() { // from class: X.0aTA
            @Override // X.InterfaceC936350aTR
            public final void LIZ(long j2) {
                this.LIZ.LJFF = Long.valueOf(j2);
                if (this.LIZ.LJ) {
                    C19487311Lz.LIZJ(C936250aTH.LIZIZ(j2), null, new C09JN() { // from class: X.0T7X
                        @Override // X.C09JN
                        public final void accept(Object obj) {
                            C1C7U.LIZ("GenerateTask@b0b7.startCreateAvatar$1$onAvatarGenerateStart$1");
                            C20441214yg.LIZIZ("GenerateTask", "onAvatarGenerateStart cancel avatar suc");
                            C1C7U.LIZIZ("GenerateTask@b0b7.startCreateAvatar$1$onAvatarGenerateStart$1");
                        }
                    }, new C09JN() { // from class: X.0T7Y
                        @Override // X.C09JN
                        public final void accept(Object obj) {
                            C1C7U.LIZ("GenerateTask@b0b7.startCreateAvatar$1$onAvatarGenerateStart$2");
                            C20441214yg.LJ("GenerateTask", "onAvatarGenerateStart cancel avatar fail");
                            C1C7U.LIZIZ("GenerateTask@b0b7.startCreateAvatar$1$onAvatarGenerateStart$2");
                        }
                    }, 24);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.InterfaceC936350aTR
            public final void LIZJ(int i) {
                C936170aT9 c936170aT9 = this.LIZ;
                C09AJ<C936030aSv> c09aj3 = c936170aT9.LIZLLL;
                if (c09aj3 != null) {
                    c09aj3.onNext(new C936030aSv(c936170aT9, EnumC935940aSm.STATE_PROGRESS, ((i * 80) / 100) + 10, null, 0 == true ? 1 : 0, 24));
                }
            }

            @Override // X.InterfaceC936350aTR
            public final void LIZLLL(Avatar avatar) {
                this.LIZ.LJFF = Long.valueOf(avatar.avatarId);
                C936170aT9 c936170aT9 = this.LIZ;
                C09AJ<C936030aSv> c09aj3 = c936170aT9.LIZLLL;
                if (c09aj3 != null) {
                    c09aj3.onNext(new C936030aSv(c936170aT9, EnumC935940aSm.STATE_PROGRESS, 90, avatar, null, 16));
                }
                C936170aT9 c936170aT92 = this.LIZ;
                c936170aT92.getClass();
                C20441214yg.LIZIZ("GenerateTask", "downloadAvatar");
                c936170aT92.LJIIIIZZ = avatar;
                if (!c936170aT92.LJ) {
                    C204692157q c204692157q = C204692157q.LIZ;
                    C936190aTB c936190aTB = new C936190aTB(c936170aT92, avatar);
                    c204692157q.getClass();
                    C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C204695157t(c936190aTB, avatar, null), 3);
                }
            }

            @Override // X.InterfaceC936350aTR
            public final void LIZIZ(int i, Avatar avatar) {
                C936170aT9 c936170aT9 = this.LIZ;
                c936170aT9.LJIIIIZZ = avatar;
                C09AJ<C936030aSv> c09aj3 = c936170aT9.LIZLLL;
                if (c09aj3 != null) {
                    EnumC935940aSm enumC935940aSm = EnumC935940aSm.STATE_FAILED;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("generate_fail_");
                    sbLIZ.append(i);
                    c09aj3.onNext(new C936030aSv(c936170aT9, enumC935940aSm, 0, avatar, C2188811AlT.LIZIZ(sbLIZ)));
                }
                C09AJ<C936030aSv> c09aj4 = this.LIZ.LIZLLL;
                if (c09aj4 != null) {
                    c09aj4.onComplete();
                }
            }
        };
        AnonymousClass0114 anonymousClass0114 = C936250aTH.LJIIIZ;
        final C936340aTQ c936340aTQ = new C936340aTQ(str, j, r9, anonymousClass0114);
        c936340aTQ.LJIIL = System.currentTimeMillis();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("start imageUri=");
        sbLIZ.append(str);
        sbLIZ.append(", styleId=");
        sbLIZ.append(j);
        C20441214yg.LIZIZ("AvatarGenerateTask", C2188811AlT.LIZIZ(sbLIZ));
        c936340aTQ.LJIIJJI = C936250aTH.LIZJ(j, str);
        ?? r1 = new AnonymousClass0115() { // from class: X.0aTP
            @Override // X.AnonymousClass0115
            public final void LIZ(C936360aTS c936360aTS) {
            }

            @Override // X.AnonymousClass0115
            public final void LIZJ(AnonymousClass0117 anonymousClass0117) {
            }

            @Override // X.AnonymousClass0115
            public final void LIZIZ(Avatar avatar) {
                String uri;
                C936340aTQ c936340aTQ2 = c936340aTQ;
                if (!c936340aTQ2.LJIIJ && avatar != null) {
                    boolean z2 = C936250aTH.LIZIZ;
                    ImageModel imageModel = avatar.image;
                    if (imageModel == null || (uri = imageModel.getUri()) == null) {
                        uri = "";
                    }
                    String strLIZJ = C936250aTH.LIZJ(avatar.styleId, uri);
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("ignore generate avatar message currentAvatar=");
                    sbLIZ2.append(c936340aTQ2.LJIIJJI);
                    sbLIZ2.append(", resultAvatar=");
                    sbLIZ2.append(strLIZJ);
                    C20441214yg.LIZIZ("AvatarGenerateTask", C2188811AlT.LIZIZ(sbLIZ2));
                    if (Intrinsics.LJFF(c936340aTQ2.LJIIJJI, strLIZJ)) {
                        int i = avatar.status;
                        if (i != 1) {
                            if (i == 9 || i == 3 || i == 4 || i == 5 || i == 6 || i == 7) {
                                c936340aTQ2.LIZJ.LIZIZ(i, avatar);
                                C936400aTW.LIZ(c936340aTQ2.LIZIZ, avatar.avatarId, c936340aTQ2.LIZ, (int) ((System.currentTimeMillis() - c936340aTQ2.LJIIL) / ((long) LSPassThroughRecordSizeConfig.DEFAULT)), false, avatar.status, avatar.failedReason, false);
                            }
                        } else {
                            c936340aTQ2.LIZJ.LIZJ(100);
                            c936340aTQ2.LIZJ.LIZLLL(avatar);
                            C936400aTW.LIZ(c936340aTQ2.LIZIZ, avatar.avatarId, c936340aTQ2.LIZ, (int) ((System.currentTimeMillis() - c936340aTQ2.LJIIL) / ((long) LSPassThroughRecordSizeConfig.DEFAULT)), true, 0, "", false);
                        }
                        c936340aTQ2.LIZ();
                    }
                }
            }
        };
        c936340aTQ.LJII = r1;
        if (anonymousClass0114 != null) {
            anonymousClass0114.LIZIZ.add((AnonymousClass0115) r1);
        }
        AvatarCreateReq avatarCreateReq = new AvatarCreateReq();
        avatarCreateReq.imageUri = str;
        avatarCreateReq.styleId = j;
        avatarCreateReq.applier = C936250aTH.LJ();
        avatarCreateReq.common = C936250aTH.LIZLLL();
        C480460Ism.LIZ().getClass();
        C19487311Lz.LIZJ(C01NB.LIZ(((IAvatarAPI) C480460Ism.LIZLLL(IAvatarAPI.class)).createAvatar(avatarCreateReq).LJJIJIIJI(C11S5.LIZ()).LJJ(C953780avY.LIZIZ).LJIILL(new C09JN() { // from class: X.00SO
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("AvatarDataManager@42e9.create$1");
                C930480aJy.LIZ.getClass();
                C1C7U.LIZIZ("AvatarDataManager@42e9.create$1");
            }
        }).LJIIL(new C09JN() { // from class: X.00Ka
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("AvatarDataManager@42e9.create$2");
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("create:");
                sbLIZ2.append(((Throwable) obj).getMessage());
                C20441214yg.LJ("AvatarDataManager", C2188811AlT.LIZIZ(sbLIZ2));
                C1C7U.LIZIZ("AvatarDataManager@42e9.create$2");
            }
        })).LJFF(new C0UO0()), c936340aTQ.LJ, new AfS184S0100000_15(c936340aTQ, 192), new AfS184S0100000_15(c936340aTQ, 193), 24);
    }

    public final boolean LIZ() {
        if (this.LJ) {
            return false;
        }
        C936030aSv value = this.LJIIJ.getValue();
        if ((value != null ? value.LIZIZ : null) != EnumC935940aSm.STATE_FAILED || this.LJII == null) {
            return false;
        }
        Avatar avatar = this.LJIIIIZZ;
        return avatar == null || avatar.status == 1;
    }

    public final void LIZJ() {
        if (this.LJIIIZ) {
            return;
        }
        this.LJIIIZ = true;
        C19487311Lz.LIZIZ(C11NZ.LJIJJLI(new C987240bnW(this, 3)).LJJJLZIJ(C1701940uOG.LIZIZ()), null, new AfS184S0100000_15(this, 106), new AfS184S0100000_15(this, 107), null, null, 56);
    }

    public final void LIZIZ(C11NJ c11nj, Function0<Unit> function0) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("cancel cur:");
        sbLIZ.append(this.LJ);
        sbLIZ.append(" id:");
        sbLIZ.append(this.LJFF);
        C20441214yg.LIZIZ("GenerateTask", C2188811AlT.LIZIZ(sbLIZ));
        if (this.LJ) {
            if (function0 != null) {
                function0.invoke();
                return;
            }
            return;
        }
        this.LJ = true;
        C09AJ<C936030aSv> c09aj = this.LIZLLL;
        if (c09aj != null) {
            c09aj.onComplete();
        }
        Long l = this.LJFF;
        if (l != null) {
            long jLongValue = l.longValue();
            C19487311Lz.LIZJ(C936250aTH.LIZIZ(jLongValue).LJJ(C1701940uOG.LIZIZ()), c11nj, new AfS4S0100100_12(jLongValue, function0, 12), new AfS4S0100100_12(jLongValue, function0, 13), 24);
        }
    }

    public C936170aT9(int i, long j, AwS594S0100000_15 awS594S0100000_15) {
        this.LIZ = j;
        this.LIZIZ = awS594S0100000_15;
        this.LIZJ = i;
    }
}
