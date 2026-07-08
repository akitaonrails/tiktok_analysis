package X;

import android.os.Bundle;
import android.os.Parcel;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.gms.measurement.internal.zzac;
import com.google.android.gms.measurement.internal.zzal;
import com.google.android.gms.measurement.internal.zzbf;
import com.google.android.gms.measurement.internal.zzn;
import com.google.android.gms.measurement.internal.zzno;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

/* JADX INFO: renamed from: X.12a8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public abstract class AbstractBinderC19779412a8 extends C0WGD implements InterfaceC19802012dm {
    public AbstractBinderC19779412a8() {
        super("com.google.android.gms.measurement.internal.IMeasurementService");
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // X.C0WGD
    public final boolean LJJJZ(int i, Parcel parcel, Parcel parcel2) {
        ArrayList arrayList;
        boolean z = false;
        switch (i) {
            case 1:
                zzbf zzbfVar = (zzbf) C0W8X.LIZ(parcel, zzbf.CREATOR);
                zzn zznVar = (zzn) C0W8X.LIZ(parcel, zzn.CREATOR);
                C0W8X.LIZLLL(parcel);
                ((BinderC19779312a7) this).LLZZJLIL(zzbfVar, zznVar);
                parcel2.writeNoException();
                return true;
            case 2:
                zzno zznoVar = (zzno) C0W8X.LIZ(parcel, zzno.CREATOR);
                zzn zznVar2 = (zzn) C0W8X.LIZ(parcel, zzn.CREATOR);
                C0W8X.LIZLLL(parcel);
                ((BinderC19779312a7) this).LLIZ(zznoVar, zznVar2);
                parcel2.writeNoException();
                return true;
            case 3:
            case 8:
            case 22:
            case 23:
            default:
                return false;
            case 4:
                zzn zznVar3 = (zzn) C0W8X.LIZ(parcel, zzn.CREATOR);
                C0W8X.LIZLLL(parcel);
                ((BinderC19779312a7) this).I(zznVar3);
                parcel2.writeNoException();
                return true;
            case 5:
                final zzbf zzbfVar2 = (zzbf) C0W8X.LIZ(parcel, zzbf.CREATOR);
                final String string = parcel.readString();
                parcel.readString();
                C0W8X.LIZLLL(parcel);
                final BinderC19779312a7 binderC19779312a7 = (BinderC19779312a7) this;
                C0W3J.LJIIIIZZ(zzbfVar2);
                C0W3J.LJI(string);
                binderC19779312a7.LLLIIL(string, true);
                binderC19779312a7.x(new Runnable() { // from class: X.12Ze
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("zzig@391f.run");
                        try {
                            binderC19779312a7.LL.LJJJLIIL();
                            binderC19779312a7.LL.LJIIZILJ(zzbfVar2, string);
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("zzig@391f.run");
                    }
                });
                parcel2.writeNoException();
                return true;
            case 6:
                zzn zznVar4 = (zzn) C0W8X.LIZ(parcel, zzn.CREATOR);
                C0W8X.LIZLLL(parcel);
                ((BinderC19779312a7) this).F(zznVar4);
                parcel2.writeNoException();
                return true;
            case 7:
                zzn zznVar5 = (zzn) C0W8X.LIZ(parcel, zzn.CREATOR);
                if (parcel.readInt() != 0) {
                    z = true;
                }
                C0W8X.LIZLLL(parcel);
                final BinderC19779312a7 binderC19779312a72 = (BinderC19779312a7) this;
                binderC19779312a72.LLLLII(zznVar5);
                final String str = zznVar5.zza;
                C0W3J.LJIIIIZZ(str);
                try {
                    List<C19784112at> list = (List) binderC19779312a72.LL.LJIIL().LJIIIZ(new Callable<List<C19784112at>>() { // from class: X.12a4
                        @Override // java.util.concurrent.Callable
                        public final /* synthetic */ List<C19784112at> call() throws Throwable {
                            C1C7U.LIZ("zzik@3923.call");
                            binderC19779312a72.LL.LJJJLIIL();
                            List<C19784112at> listLJJLIIIIJ = binderC19779312a72.LL.LJJJJIZL().LJJLIIIIJ(str);
                            C1C7U.LIZIZ("zzik@3923.call");
                            return listLJJLIIIIJ;
                        }
                    }).get();
                    arrayList = new ArrayList(list.size());
                    for (C19784112at c19784112at : list) {
                        if (z || !C19803112dx.LJJLIL(c19784112at.LIZJ)) {
                            arrayList.add(new zzno(c19784112at));
                        }
                        break;
                    }
                } catch (InterruptedException | ExecutionException e) {
                    TryCatchGuardChecker.doCheck(e);
                    binderC19779312a72.LL.LJIILJJIL().LJFF.LIZIZ(C19806212eS.LJIIJ(zznVar5.zza), "Failed to get user properties. appId", e);
                    arrayList = null;
                }
                parcel2.writeNoException();
                parcel2.writeTypedList(arrayList);
                return true;
            case BdTuring.TYPE_ECAF /* 9 */:
                zzbf zzbfVar3 = (zzbf) C0W8X.LIZ(parcel, zzbf.CREATOR);
                String string2 = parcel.readString();
                C0W8X.LIZLLL(parcel);
                byte[] bArrF1 = ((BinderC19779312a7) this).f1(zzbfVar3, string2);
                parcel2.writeNoException();
                parcel2.writeByteArray(bArrF1);
                return true;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                long j = parcel.readLong();
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                C0W8X.LIZLLL(parcel);
                ((BinderC19779312a7) this).LLLZLZ(j, string3, string4, string5);
                parcel2.writeNoException();
                return true;
            case BdTuring.TYPE_EMAIL /* 11 */:
                zzn zznVar6 = (zzn) C0W8X.LIZ(parcel, zzn.CREATOR);
                C0W8X.LIZLLL(parcel);
                String strN = ((BinderC19779312a7) this).n(zznVar6);
                parcel2.writeNoException();
                parcel2.writeString(strN);
                return true;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                zzac zzacVar = (zzac) C0W8X.LIZ(parcel, zzac.CREATOR);
                zzn zznVar7 = (zzn) C0W8X.LIZ(parcel, zzn.CREATOR);
                C0W8X.LIZLLL(parcel);
                ((BinderC19779312a7) this).LLJJJJLIIL(zzacVar, zznVar7);
                parcel2.writeNoException();
                return true;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                zzac zzacVar2 = (zzac) C0W8X.LIZ(parcel, zzac.CREATOR);
                C0W8X.LIZLLL(parcel);
                final BinderC19779312a7 binderC19779312a73 = (BinderC19779312a7) this;
                C0W3J.LJIIIIZZ(zzacVar2);
                C0W3J.LJIIIIZZ(zzacVar2.zzc);
                C0W3J.LJI(zzacVar2.zza);
                binderC19779312a73.LLLIIL(zzacVar2.zza, true);
                final zzac zzacVar3 = new zzac(zzacVar2);
                binderC19779312a73.x(new Runnable() { // from class: X.12ZO
                    public final void LIZ() throws Throwable {
                        binderC19779312a73.LL.LJJJLIIL();
                        if (zzacVar3.zzc.zza() == null) {
                            C12Z4 c12z4 = binderC19779312a73.LL;
                            zzac zzacVar4 = zzacVar3;
                            c12z4.getClass();
                            String str2 = zzacVar4.zza;
                            C0W3J.LJIIIIZZ(str2);
                            zzn zznVarLJJIJLIJ = c12z4.LJJIJLIJ(str2);
                            if (zznVarLJJIJLIJ != null) {
                                c12z4.LJIILL(zzacVar4, zznVarLJJIJLIJ);
                                return;
                            }
                            return;
                        }
                        C12Z4 c12z42 = binderC19779312a73.LL;
                        zzac zzacVar5 = zzacVar3;
                        c12z42.getClass();
                        String str3 = zzacVar5.zza;
                        C0W3J.LJIIIIZZ(str3);
                        zzn zznVarLJJIJLIJ2 = c12z42.LJJIJLIJ(str3);
                        if (zznVarLJJIJLIJ2 != null) {
                            c12z42.LJJIJIIJIL(zzacVar5, zznVarLJJIJLIJ2);
                        }
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("zzhv@390f.run");
                        try {
                            LIZ();
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("zzhv@390f.run");
                    }
                });
                parcel2.writeNoException();
                return true;
            case 14:
                String string6 = parcel.readString();
                String string7 = parcel.readString();
                if (parcel.readInt() != 0) {
                    z = true;
                }
                zzn zznVar8 = (zzn) C0W8X.LIZ(parcel, zzn.CREATOR);
                C0W8X.LIZLLL(parcel);
                List<zzno> listLLLLLLLLLL = ((BinderC19779312a7) this).LLLLLLLLLL(string6, string7, z, zznVar8);
                parcel2.writeNoException();
                parcel2.writeTypedList(listLLLLLLLLLL);
                return true;
            case 15:
                String string8 = parcel.readString();
                String string9 = parcel.readString();
                String string10 = parcel.readString();
                if (parcel.readInt() != 0) {
                    z = true;
                }
                C0W8X.LIZLLL(parcel);
                List<zzno> listLLLZ = ((BinderC19779312a7) this).LLLZ(string8, string9, string10, z);
                parcel2.writeNoException();
                parcel2.writeTypedList(listLLLZ);
                return true;
            case 16:
                String string11 = parcel.readString();
                String string12 = parcel.readString();
                zzn zznVar9 = (zzn) C0W8X.LIZ(parcel, zzn.CREATOR);
                C0W8X.LIZLLL(parcel);
                List<zzac> listLLJLILLLLZIIL = ((BinderC19779312a7) this).LLJLILLLLZIIL(string11, string12, zznVar9);
                parcel2.writeNoException();
                parcel2.writeTypedList(listLLJLILLLLZIIL);
                return true;
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                String string13 = parcel.readString();
                String string14 = parcel.readString();
                String string15 = parcel.readString();
                C0W8X.LIZLLL(parcel);
                List<zzac> listG0 = ((BinderC19779312a7) this).g0(string13, string14, string15);
                parcel2.writeNoException();
                parcel2.writeTypedList(listG0);
                return true;
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                zzn zznVar10 = (zzn) C0W8X.LIZ(parcel, zzn.CREATOR);
                C0W8X.LIZLLL(parcel);
                ((BinderC19779312a7) this).L(zznVar10);
                parcel2.writeNoException();
                return true;
            case 19:
                Bundle bundle = (Bundle) C0W8X.LIZ(parcel, Bundle.CREATOR);
                zzn zznVar11 = (zzn) C0W8X.LIZ(parcel, zzn.CREATOR);
                C0W8X.LIZLLL(parcel);
                ((BinderC19779312a7) this).mo35LJJJIL(bundle, zznVar11);
                parcel2.writeNoException();
                return true;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                zzn zznVar12 = (zzn) C0W8X.LIZ(parcel, zzn.CREATOR);
                C0W8X.LIZLLL(parcel);
                ((BinderC19779312a7) this).B(zznVar12);
                parcel2.writeNoException();
                return true;
            case 21:
                zzn zznVar13 = (zzn) C0W8X.LIZ(parcel, zzn.CREATOR);
                C0W8X.LIZLLL(parcel);
                zzal zzalVarH = ((BinderC19779312a7) this).h(zznVar13);
                parcel2.writeNoException();
                if (zzalVarH == null) {
                    parcel2.writeInt(0);
                    return true;
                }
                parcel2.writeInt(1);
                zzalVarH.writeToParcel(parcel2, 1);
                return true;
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                zzn zznVar14 = (zzn) C0W8X.LIZ(parcel, zzn.CREATOR);
                Bundle bundle2 = (Bundle) C0W8X.LIZ(parcel, Bundle.CREATOR);
                C0W8X.LIZLLL(parcel);
                List listLJJJIL = ((BinderC19779312a7) this).LJJJIL(bundle2, zznVar14);
                parcel2.writeNoException();
                parcel2.writeTypedList(listLJJJIL);
                return true;
            case 25:
                zzn zznVar15 = (zzn) C0W8X.LIZ(parcel, zzn.CREATOR);
                C0W8X.LIZLLL(parcel);
                ((BinderC19779312a7) this).R(zznVar15);
                parcel2.writeNoException();
                return true;
            case 26:
                zzn zznVar16 = (zzn) C0W8X.LIZ(parcel, zzn.CREATOR);
                C0W8X.LIZLLL(parcel);
                ((BinderC19779312a7) this).E(zznVar16);
                parcel2.writeNoException();
                return true;
        }
    }
}
