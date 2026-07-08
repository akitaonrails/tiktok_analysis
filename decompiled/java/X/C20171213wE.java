package X;

import com.ss.android.ugc.aweme.social.sticker.model.StorySocialEventPrepareData;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.13wE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public class C20171213wE extends C20169913w1<StorySocialEventPrepareData> {
    public final C20168613vo LIZLLL;
    public final Long LJ;
    public final Function2<C20169813w0<StorySocialEventPrepareData>, InterfaceC1364105Vn<? super C20170413w6>, Object> LJFF;

    @Override // X.C20169913w1
    public final Function2<C20169813w0<StorySocialEventPrepareData>, InterfaceC1364105Vn<? super C20170413w6>, Object> LIZ() {
        return this.LJFF;
    }

    @Override // X.C20169913w1
    public final C20168613vo LIZIZ() {
        return this.LIZLLL;
    }

    @Override // X.C20169913w1
    public final Long LIZLLL() {
        return this.LJ;
    }

    public C20171213wE(C20168613vo c20168613vo) {
        super(c20168613vo, (Long) null, (Function2) null);
        this.LIZLLL = c20168613vo;
        this.LJ = null;
        this.LJFF = null;
    }

    @Override // X.C20169913w1
    /* JADX INFO: renamed from: LJI, reason: merged with bridge method [inline-methods] */
    public final C20170413w6 LIZJ(StorySocialEventPrepareData storySocialEventPrepareData, EnumC20169713vz enumC20169713vz, Integer num) {
        boolean zIsPreload;
        C20170413w6 c20170413w6LIZJ = super.LIZJ(storySocialEventPrepareData, enumC20169713vz, num);
        C20171513wH performanceMetaData = storySocialEventPrepareData.getPerformanceMetaData();
        if (performanceMetaData != null) {
            zIsPreload = performanceMetaData.isPreload();
        } else {
            zIsPreload = false;
        }
        c20170413w6LIZJ.LJI = zIsPreload;
        return c20170413w6LIZJ;
    }
}
