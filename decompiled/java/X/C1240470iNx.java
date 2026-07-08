package X;

import Y.AComparatorS38S0000000_19;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS226S0000000_35;
import kotlin.jvm.internal.AFwS231S0000000_3;
import kotlin.jvm.internal.AFwS248S0000000_14;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AwS563S0100000_19;

/* JADX INFO: renamed from: X.0iNx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1240470iNx implements InterfaceC1240700iOK<C1240530iO3> {
    public final boolean LIZ;
    public final Function2<List<String>, InterfaceC1364105Vn<? super List<? extends IMUser>>, Object> LIZIZ;
    public final Function1<String, String> LIZJ;
    public final Function1<String, C0Y8T> LIZLLL;
    public final Function1<List<String>, List<C0Y8T>> LJ;
    public final C1231704rr LJFF;
    public final Function0<Unit> LJI;
    public final EnumC1240620iOC LJII;
    public final C01GW LJIIIIZZ;

    public C1240470iNx() {
        throw null;
    }

    public C1240470iNx(boolean z) {
        EnumC1240620iOC enumC1240620iOC;
        C05L7 c05l7 = new C05L7(null);
        AFwS257S0000000_19 aFwS257S0000000_19 = AFwS257S0000000_19.get$arr$(564);
        AFwS231S0000000_3 aFwS231S0000000_3 = AFwS231S0000000_3.get$arr$(128);
        AFwS248S0000000_14 aFwS248S0000000_14 = AFwS248S0000000_14.get$arr$(369);
        C1231704rr c1231704rr = new C1231704rr("accounts_engine", "search", 4);
        AFwS226S0000000_35 aFwS226S0000000_35 = AFwS226S0000000_35.get$arr$(385);
        this.LIZ = z;
        this.LIZIZ = c05l7;
        this.LIZJ = aFwS257S0000000_19;
        this.LIZLLL = aFwS231S0000000_3;
        this.LJ = aFwS248S0000000_14;
        this.LJFF = c1231704rr;
        this.LJI = aFwS226S0000000_35;
        if (z) {
            enumC1240620iOC = EnumC1240620iOC.ALL;
        } else {
            enumC1240620iOC = EnumC1240620iOC.ACCOUNT;
        }
        this.LJII = enumC1240620iOC;
        this.LJIIIIZZ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2787));
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // X.InterfaceC1240700iOK
    public final Object LIZIZ(List<? extends C1240530iO3> list, InterfaceC1364105Vn<? super List<? extends C1240530iO3>> interfaceC1364105Vn) {
        String conversationId;
        C1231704rr c1231704rr = this.LJFF;
        C13LP.LJJLIIIJ(list, null, null, null, 0, null, AFwS257S0000000_19.get$arr$(565), 31);
        c1231704rr.getClass();
        List listLJLLLL = C13LP.LJLLLL(new AComparatorS38S0000000_19(1), list);
        C1231704rr c1231704rr2 = this.LJFF;
        C13LP.LJJLIIIJ(listLJLLLL, null, null, null, 0, null, AFwS257S0000000_19.get$arr$(566), 31);
        c1231704rr2.getClass();
        int size = listLJLLLL.size();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj : listLJLLLL) {
            int i2 = i + 1;
            Map<String, String> mapLJ = null;
            Integer numValueOf = null;
            if (i >= 0) {
                C1240530iO3 c1240530iO3 = (C1240530iO3) obj;
                InterfaceC1240540iO4 interfaceC1240540iO4 = c1240530iO3.LL;
                String str = "";
                if (interfaceC1240540iO4 instanceof C1240220iNY) {
                    conversationId = ((C1240220iNY) interfaceC1240540iO4).LIZ.getUid();
                    if (conversationId == null) {
                        conversationId = "";
                    }
                    C1240220iNY c1240220iNY = (C1240220iNY) interfaceC1240540iO4;
                    IMUser iMUser = c1240220iNY.LIZ;
                    C0Y8T c0y8t = c1240220iNY.LIZIZ;
                    C1240520iO2 c1240520iO2 = c1240530iO3.LLILLJJLI;
                    if (c1240520iO2 != null) {
                        numValueOf = Integer.valueOf(c1240520iO2.LIZIZ);
                    }
                    mapLJ = C1240600iOA.LIZIZ.LIZLLL(EnumC1240610iOB.USER_CELL, this.LJII, iMUser, c0y8t, i, size, this.LIZ, numValueOf);
                    c1240220iNY.LJII = mapLJ;
                } else {
                    if (interfaceC1240540iO4 instanceof C1240210iNX) {
                        conversationId = ((C1240210iNX) interfaceC1240540iO4).LIZ.getConversationId();
                        conversationId.toString();
                    } else {
                        conversationId = null;
                    }
                    if (interfaceC1240540iO4 instanceof C1240210iNX) {
                        C1240210iNX c1240210iNX = (C1240210iNX) interfaceC1240540iO4;
                        mapLJ = C1240600iOA.LIZIZ.LJ(EnumC1240610iOB.USER_CELL, this.LJII, c1240210iNX.LIZ, i, size, this.LIZ);
                        c1240210iNX.LJII = mapLJ;
                    }
                }
                if (conversationId != null && conversationId.length() != 0 && mapLJ != null && !mapLJ.isEmpty()) {
                    if (conversationId != null) {
                        str = conversationId;
                    }
                    if (mapLJ == null) {
                        mapLJ = C2097608Jq.LJ();
                    }
                    C1240530iO3 c1240530iO3LIZ = C1240530iO3.LIZ(c1240530iO3, str, mapLJ, 487);
                    if (c1240530iO3LIZ != null) {
                        arrayList.add(c1240530iO3LIZ);
                    }
                }
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00ee  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(java.lang.String r20, X.InterfaceC1364105Vn<? super X.C1240780iOS<X.C1240530iO3>> r21) {
        /*
            Method dump skipped, instruction units count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1240470iNx.LIZJ(java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0214  */
    @Override // X.InterfaceC1240700iOK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(java.util.List<X.C1240340iNk> r21, X.C1240770iOR r22, X.C1240760iOQ r23, X.InterfaceC1364105Vn<? super java.util.List<? extends X.C1240530iO3>> r24) {
        /*
            Method dump skipped, instruction units count: 708
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1240470iNx.LIZ(java.util.List, X.0iOR, X.0iOQ, X.05Vn):java.lang.Object");
    }
}
