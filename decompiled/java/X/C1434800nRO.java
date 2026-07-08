package X;

import com.ss.android.ugc.aweme.shortvideo.CreateBaseAwemeResponse;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.AFwS210S0000000_22;
import kotlin.jvm.internal.AwS636S0100000_22;

/* JADX INFO: renamed from: X.0nRO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1434800nRO extends AbstractC1434920nRa {
    public final PublishModel LIZJ;
    public final C1430790nKv LIZLLL;
    public final InterfaceC1434300nQa LJ;
    public final Executor LJFF;
    public final String LJI;
    public AbstractC1433570nPP LJII;
    public final C1434970nRf LJIIIIZZ;
    public final C1434960nRe LJIIIZ;
    public volatile C1D80 LJIIJ;

    @Override // X.InterfaceC1433580nPQ
    public final boolean LJIJ() {
        return true;
    }

    public final void LIZ() {
        C1D82 c1d82 = new C1D82(AFwS210S0000000_22.get$arr$(445), EnumC1434770nRL.AUTH_KEY);
        C1D82 c1d822 = new C1D82(AFwS210S0000000_22.get$arr$(449), EnumC1434770nRL.UPLOAD);
        C1D82 c1d823 = new C1D82(AFwS210S0000000_22.get$arr$(448), EnumC1434770nRL.CUSTOM_COVER_UPLOAD);
        C1D82 c1d824 = new C1D82(AFwS210S0000000_22.get$arr$(446), EnumC1434770nRL.COVER_TEXT_UPLOAD);
        C1D82 c1d825 = new C1D82(AFwS210S0000000_22.get$arr$(447), EnumC1434770nRL.CREATE_AWEME);
        c1d823.LIZ(c1d82);
        c1d824.LIZ(c1d82);
        c1d822.LIZ(c1d82);
        c1d825.LIZ(c1d82, c1d822, c1d823, c1d824);
        C1D82[] c1d82Arr = (C1D82[]) Arrays.copyOf(new C1D82[]{c1d82}, 1);
        C1D82[] c1d82Arr2 = (C1D82[]) Arrays.copyOf(c1d82Arr, c1d82Arr.length);
        C1440550naf c1440550naf = new C1440550naf("PcsCourseVideoPublisher", (C1D82[]) Arrays.copyOf(c1d82Arr2, c1d82Arr2.length));
        c1440550naf.LIZIZ = this.LJI;
        c1440550naf.LIZJ = true;
        ArrayList arrayList = (ArrayList) c1440550naf.LIZLLL;
        arrayList.add(this.LJIIIIZZ);
        arrayList.add(this.LJIIIZ);
        arrayList.add(new C1404570med(this.LJI));
        arrayList.add(this.LIZLLL);
        arrayList.add(this.LJ);
        arrayList.add(C1439900nZc.LIZ(this.LJIIIZ.LIZ));
        arrayList.add(new C1434590nR3());
        c1440550naf.LJ = C1435270nS9.LIZ();
        c1440550naf.LJII = new C1435280nSA(this.LJFF);
        this.LJ.LJFF();
        c1440550naf.LJIIIIZZ = new C1435280nSA(C1434840nRS.LJ());
        this.LJ.LJFF();
        c1440550naf.LJIIIZ = new C1435280nSA(C1434840nRS.LIZJ());
        this.LJIIJ = c1440550naf.LIZ();
        C1D80 c1d80 = this.LJIIJ;
        if (c1d80 != null) {
            c1d80.LIZ(new AbstractC1435400nSM() { // from class: X.0nRb
                public final EnumC1434950nRd LJI;

                {
                    EnumC1434770nRL enumC1434770nRL = EnumC1434770nRL.CREATE_AWEME;
                    this.LJI = EnumC1434950nRd.CREATE_AWEME;
                }

                @Override // X.AbstractC1435400nSM
                public final EnumC1434950nRd LJI() {
                    return this.LJI;
                }
            });
            c1d80.LIZ(new AbstractC1435400nSM() { // from class: X.0nRc
                public final EnumC1434950nRd LJI;

                {
                    EnumC1434770nRL enumC1434770nRL = EnumC1434770nRL.UPLOAD;
                    this.LJI = EnumC1434950nRd.UPLOAD;
                }

                @Override // X.AbstractC1435400nSM
                public final EnumC1434950nRd LJI() {
                    return this.LJI;
                }
            });
            AbstractC1433570nPP abstractC1433570nPP = this.LJII;
            if (abstractC1433570nPP != null) {
                final C1434670nRB c1434670nRB = new C1434670nRB(this.LIZJ, abstractC1433570nPP);
                final String str = c1d80.LJIIJ;
                AbstractC1446660nkW abstractC1446660nkW = new AbstractC1446660nkW(str, c1434670nRB) { // from class: X.0nR8
                    public final C1434670nRB LJ;
                    public C1404570med LJFF;
                    public C1434970nRf LJI;

                    @Override // X.AbstractC1446660nkW
                    public final void LIZLLL(Object obj, C556300Lro c556300Lro, AbstractC556190Lrd abstractC556190Lrd) {
                    }

                    {
                        this.LJ = c1434670nRB;
                    }

                    @Override // X.AbstractC1446660nkW
                    public final void LJ(Object obj, C1404610meh c1404610meh) {
                        Object obj2;
                        Object next;
                        PublishModel publishModel;
                        String str2;
                        Iterator<Object> it2 = c1404610meh.LIZ.iterator();
                        while (true) {
                            obj2 = null;
                            if (it2.hasNext()) {
                                next = it2.next();
                                if (next == null || (next instanceof C1404570med)) {
                                    break;
                                }
                            } else {
                                next = null;
                                break;
                            }
                        }
                        this.LJFF = (C1404570med) next;
                        for (Object obj3 : c1404610meh.LIZ) {
                            if (obj3 == null || (obj3 instanceof C1434970nRf)) {
                                obj2 = obj3;
                                break;
                            }
                        }
                        C1434970nRf c1434970nRf = (C1434970nRf) obj2;
                        this.LJI = c1434970nRf;
                        if (c1434970nRf != null && (publishModel = c1434970nRf.LIZ) != null) {
                            C1404570med c1404570med = this.LJFF;
                            if (c1404570med == null || (str2 = c1404570med.LIZ) == null) {
                                str2 = "";
                            }
                            publishModel.publishId = str2;
                        }
                    }

                    @Override // X.AbstractC1446660nkW
                    public final void LIZ(Object obj, AbstractC1404540mea abstractC1404540mea, int i, int i2) {
                        PublishModel publishModel;
                        C1434670nRB c1434670nRB2 = this.LJ;
                        C1431740nMS c1431740nMS = C1431740nMS.INSTANCE;
                        C1434970nRf c1434970nRf = this.LJI;
                        if (c1434970nRf != null) {
                            publishModel = c1434970nRf.LIZ;
                        } else {
                            publishModel = null;
                        }
                        c1434670nRB2.LIZIZ(c1431740nMS, publishModel);
                    }

                    @Override // X.AbstractC1446660nkW
                    public final void LIZJ(Object obj, C1435220nS4 c1435220nS4, int i, int i2) {
                        PublishModel publishModel;
                        Throwable t = c1435220nS4.getT();
                        C1434340nQe c1434340nQe = C1434330nQd.Companion;
                        int code = c1435220nS4.getCode();
                        c1434340nQe.getClass();
                        C1434650nR9 c1434650nR9 = new C1434650nR9(t, C1434340nQe.LIZ(code), c1435220nS4.getCode(), c1435220nS4.getNodeTag().toString());
                        c1434650nR9.setPublishDuration(i);
                        c1434650nR9.setErrorCode(c1435220nS4.getCode());
                        c1434650nR9.setServerLogId(C1431420nLw.LJ(c1435220nS4));
                        c1434650nR9.setFailedTaskTag(obj);
                        c1434650nR9.setOriginErrorCode(c1435220nS4.getCode());
                        C1434670nRB c1434670nRB2 = this.LJ;
                        C1434970nRf c1434970nRf = this.LJI;
                        if (c1434970nRf != null) {
                            publishModel = c1434970nRf.LIZ;
                        } else {
                            publishModel = null;
                        }
                        c1434670nRB2.LIZIZ(c1434650nR9, publishModel);
                    }

                    @Override // X.AbstractC1446660nkW
                    public final void LJFF(Object obj, Object obj2, boolean z, int i, int i2) {
                        Iterator<Object> it2 = ((C1404610meh) obj2).LIZ.iterator();
                        while (true) {
                            PublishModel publishModel = null;
                            if (!it2.hasNext()) {
                                break;
                            }
                            Object next = it2.next();
                            if (next instanceof CreateBaseAwemeResponse) {
                                if (next != null) {
                                    CreateBaseAwemeResponse createBaseAwemeResponse = (CreateBaseAwemeResponse) next;
                                    C1434670nRB c1434670nRB2 = this.LJ;
                                    C1434970nRf c1434970nRf = this.LJI;
                                    if (c1434970nRf != null) {
                                        publishModel = c1434970nRf.LIZ;
                                    }
                                    c1434670nRB2.LIZJ(createBaseAwemeResponse, false, publishModel);
                                    return;
                                }
                            }
                        }
                        throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.CreateBaseAwemeResponse");
                    }
                };
                this.LJ.LJFF();
                c1d80.LIZ(new C2280661EOq(str, abstractC1446660nkW, C1434840nRS.LIZIZ()));
            }
            c1d80.LIZ(new C1435900nTA(C1434870nRV.LIZ(false, false, false, false, true, 14), this.LJ, "PcsCourseVideoPublisher", new AwS636S0100000_22(this, 58)));
        }
    }

    @Override // X.InterfaceC1433580nPQ
    public final void reStart() {
        C1D80 c1d80 = this.LJIIJ;
        if ((c1d80 != null ? c1d80.LIZJ() : null) instanceof C1D8S) {
            LIZ();
        }
        C1D80 c1d802 = this.LJIIJ;
        if (c1d802 != null) {
            c1d802.LJII();
        }
    }

    @Override // X.InterfaceC1433580nPQ
    public final void LJIILL(C1433230nOr c1433230nOr) {
        C1D80 c1d80 = this.LJIIJ;
        if (c1d80 != null) {
            c1d80.LIZIZ(c1433230nOr);
        }
    }

    @Override // X.InterfaceC1433580nPQ
    public final void LJIIZILJ(AbstractC1433570nPP abstractC1433570nPP) {
        this.LJII = abstractC1433570nPP;
        LIZ();
        C1D80 c1d80 = this.LJIIJ;
        if (c1d80 != null) {
            c1d80.LJII();
        }
    }

    public C1434800nRO(PublishModel publishModel, C1430790nKv c1430790nKv, Executor executor, String str) {
        C1434310nQb c1434310nQb = new C1434310nQb();
        super(c1434310nQb);
        this.LIZJ = publishModel;
        this.LIZLLL = c1430790nKv;
        this.LJ = c1434310nQb;
        this.LJFF = executor;
        this.LJI = str;
        this.LJIIIIZZ = new C1434970nRf(publishModel);
        this.LJIIIZ = new C1434960nRe((VideoPublishEditModel) publishModel.editModel);
    }
}
