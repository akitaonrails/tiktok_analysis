package X;

import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.ToIntFunction;

/* JADX INFO: renamed from: X.12zt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19939112zt extends AbstractC19939512zx implements Comparable<C19939112zt>, InterfaceC19930212yS<C19939112zt> {
    public static final C19939312zv LLJJ = new ToIntFunction() { // from class: X.12zv
        @Override // java.util.function.ToIntFunction
        public final int applyAsInt(Object obj) {
            return ((C19939112zt) obj).getNumber();
        }
    };
    public static final AnonymousClass1334[] LLJJI = AnonymousClass1334.values();
    public final int LLILLJJLI;
    public final C199412130o LLILLL;
    public volatile C131Y LLILZ;
    public final String LLILZIL;
    public final AbstractC19939512zx LLILZLL;
    public final AnonymousClass1301 LLIZ;
    public final boolean LLIZLLLIL;
    public volatile C19935112zF LLJ;
    public EnumC19937712zf LLJI;
    public AnonymousClass1301 LLJIJIL;
    public final C19939212zu LLJILJIL;
    public AbstractC19939512zx LLJILJILJ;
    public Object LLJILLL;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.12zv] */
    static {
        if (EnumC19937712zf.types.length != C130D.values().length) {
            throw new RuntimeException("descriptor.proto has a new declared type but Descriptors.java wasn't updated.");
        }
    }

    @Override // X.AbstractC19939512zx
    public final AnonymousClass1302 LJI() {
        return this.LLILZLL.LJI();
    }

    @Override // X.AbstractC19939512zx
    public final String LJIIIZ() {
        return this.LLILLL.getName();
    }

    @Override // X.AbstractC19939512zx
    public final void LJIILL() throws C19939612zy {
        AnonymousClass1301 anonymousClass1301 = this.LLJIJIL;
        if (anonymousClass1301 != null && anonymousClass1301.LLILLJJLI.getOptions().getMessageSetWireFormat() && LJJIII()) {
            if (LJJIJ() || LJJLJ() || LJJI() != EnumC19937712zf.MESSAGE) {
                throw new C19939612zy(this, "Extensions of MessageSets may not be required or repeated messages.");
            }
        }
    }

    public final void LJIILLIIL() {
        if (this.LLILLL.hasExtendee()) {
            AbstractC19939512zx abstractC19939512zxLJ = LJI().LLJ.LJ(this.LLILLL.getExtendee(), this);
            if (!(abstractC19939512zxLJ instanceof AnonymousClass1301)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append('\"');
                sbLIZ.append(this.LLILLL.getExtendee());
                sbLIZ.append("\" is not a message type.");
                throw new C19939612zy(this, C2188811AlT.LIZIZ(sbLIZ));
            }
            AnonymousClass1301 anonymousClass1301 = (AnonymousClass1301) abstractC19939512zxLJ;
            this.LLJIJIL = anonymousClass1301;
            int number = getNumber();
            int iBinarySearch = Arrays.binarySearch(anonymousClass1301.LLJILJILJ, number);
            if ((iBinarySearch < 0 && (iBinarySearch = (~iBinarySearch) - 1) < 0) || number >= anonymousClass1301.LLJILLL[iBinarySearch]) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append('\"');
                sbLIZ2.append(this.LLJIJIL.LLILZ);
                sbLIZ2.append("\" does not declare ");
                sbLIZ2.append(getNumber());
                sbLIZ2.append(" as an extension number.");
                throw new C19939612zy(this, C2188811AlT.LIZIZ(sbLIZ2));
            }
        }
        if (this.LLILLL.hasTypeName()) {
            AbstractC19939512zx abstractC19939512zxLJ2 = LJI().LLJ.LJ(this.LLILLL.getTypeName(), this);
            if (!this.LLILLL.hasType()) {
                if (abstractC19939512zxLJ2 instanceof AnonymousClass1301) {
                    this.LLJI = EnumC19937712zf.MESSAGE;
                } else {
                    if (!(abstractC19939512zxLJ2 instanceof C199422130y)) {
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append('\"');
                        sbLIZ3.append(this.LLILLL.getTypeName());
                        sbLIZ3.append("\" is not a type.");
                        throw new C19939612zy(this, C2188811AlT.LIZIZ(sbLIZ3));
                    }
                    this.LLJI = EnumC19937712zf.ENUM;
                }
            }
            if (this.LLJI.getJavaType() == EnumC19937812zg.MESSAGE) {
                if (!(abstractC19939512zxLJ2 instanceof AnonymousClass1301)) {
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append('\"');
                    sbLIZ4.append(this.LLILLL.getTypeName());
                    sbLIZ4.append("\" is not a message type.");
                    throw new C19939612zy(this, C2188811AlT.LIZIZ(sbLIZ4));
                }
                this.LLJILJILJ = abstractC19939512zxLJ2;
                if (this.LLILLL.hasDefaultValue()) {
                    throw new C19939612zy(this, "Messages can't have default values.");
                }
            } else {
                if (this.LLJI.getJavaType() != EnumC19937812zg.ENUM) {
                    throw new C19939612zy(this, "Field with primitive type has type_name.");
                }
                if (!(abstractC19939512zxLJ2 instanceof C199422130y)) {
                    StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                    sbLIZ5.append('\"');
                    sbLIZ5.append(this.LLILLL.getTypeName());
                    sbLIZ5.append("\" is not an enum type.");
                    throw new C19939612zy(this, C2188811AlT.LIZIZ(sbLIZ5));
                }
                this.LLJILJILJ = abstractC19939512zxLJ2;
            }
        } else if (this.LLJI.getJavaType() == EnumC19937812zg.MESSAGE || this.LLJI.getJavaType() == EnumC19937812zg.ENUM) {
            throw new C19939612zy(this, "Field with message or enum type missing type_name.");
        }
        if (this.LLILLL.getOptions().getPacked() && !LJJIIZI()) {
            throw new C19939612zy(this, "[packed = true] can only be specified for repeated primitive fields.");
        }
        if (!this.LLILLL.hasDefaultValue()) {
            if (LJJLJ()) {
                this.LLJILLL = Collections.emptyList();
                return;
            }
            int iOrdinal = this.LLJI.getJavaType().ordinal();
            if (iOrdinal == 7) {
                this.LLJILLL = LJIJ().LLILZIL[0];
                return;
            } else if (iOrdinal != 8) {
                this.LLJILLL = this.LLJI.getJavaType().defaultDefault;
                return;
            } else {
                this.LLJILLL = null;
                return;
            }
        }
        if (LJJLJ()) {
            throw new C19939612zy(this, "Repeated fields cannot have default values.");
        }
        try {
            switch (this.LLJI.ordinal()) {
                case 0:
                    if (this.LLILLL.getDefaultValue().equals("inf")) {
                        this.LLJILLL = Double.valueOf(Double.POSITIVE_INFINITY);
                        return;
                    }
                    if (this.LLILLL.getDefaultValue().equals("-inf")) {
                        this.LLJILLL = Double.valueOf(Double.NEGATIVE_INFINITY);
                        return;
                    } else if (this.LLILLL.getDefaultValue().equals("nan")) {
                        this.LLJILLL = Double.valueOf(Double.NaN);
                        return;
                    } else {
                        this.LLJILLL = Double.valueOf(this.LLILLL.getDefaultValue());
                        return;
                    }
                case 1:
                    if (this.LLILLL.getDefaultValue().equals("inf")) {
                        this.LLJILLL = Float.valueOf(Float.POSITIVE_INFINITY);
                        return;
                    }
                    if (this.LLILLL.getDefaultValue().equals("-inf")) {
                        this.LLJILLL = Float.valueOf(Float.NEGATIVE_INFINITY);
                        return;
                    } else if (this.LLILLL.getDefaultValue().equals("nan")) {
                        this.LLJILLL = Float.valueOf(Float.NaN);
                        return;
                    } else {
                        this.LLJILLL = CastFloatProtector.valueOf(this.LLILLL.getDefaultValue());
                        return;
                    }
                case 2:
                case 15:
                case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                    this.LLJILLL = Long.valueOf(C19924212xU.LIZJ(this.LLILLL.getDefaultValue(), true, true));
                    return;
                case 3:
                case 5:
                    this.LLJILLL = Long.valueOf(C19924212xU.LIZJ(this.LLILLL.getDefaultValue(), false, true));
                    return;
                case 4:
                case 14:
                case 16:
                    this.LLJILLL = Integer.valueOf((int) C19924212xU.LIZJ(this.LLILLL.getDefaultValue(), true, false));
                    return;
                case 6:
                case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                    this.LLJILLL = Integer.valueOf((int) C19924212xU.LIZJ(this.LLILLL.getDefaultValue(), false, false));
                    return;
                case 7:
                    this.LLJILLL = Boolean.valueOf(this.LLILLL.getDefaultValue());
                    return;
                case 8:
                    this.LLJILLL = this.LLILLL.getDefaultValue();
                    return;
                case BdTuring.TYPE_ECAF /* 9 */:
                case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                    throw new C19939612zy(this, "Message type had default value.");
                case BdTuring.TYPE_EMAIL /* 11 */:
                    try {
                        this.LLJILLL = C19924212xU.LIZLLL(this.LLILLL.getDefaultValue());
                        return;
                    } catch (C19924312xV e) {
                        TryCatchGuardChecker.doCheck(e);
                        StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                        sbLIZ6.append("Couldn't parse default value: ");
                        sbLIZ6.append(e.getMessage());
                        throw new C19939612zy(this, C2188811AlT.LIZIZ(sbLIZ6), e);
                    }
                case BdTuring.TYPE_SMS_VOICE /* 13 */:
                    C199422130y c199422130yLJIJ = LJIJ();
                    String defaultValue = this.LLILLL.getDefaultValue();
                    C19939712zz c19939712zz = c199422130yLJIJ.LJI().LLJ;
                    StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                    sbLIZ7.append(c199422130yLJIJ.LLILLL);
                    sbLIZ7.append('.');
                    sbLIZ7.append(defaultValue);
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ7);
                    c19939712zz.getClass();
                    AbstractC19939512zx abstractC19939512zxLIZJ = c19939712zz.LIZJ(strLIZIZ, EnumC19939412zw.ALL_SYMBOLS);
                    AbstractC19939512zx abstractC19939512zx = abstractC19939512zxLIZJ instanceof C199423130z ? abstractC19939512zxLIZJ : null;
                    this.LLJILLL = abstractC19939512zx;
                    if (abstractC19939512zx == null) {
                        StringBuilder sbLIZ8 = C2188811AlT.LIZ();
                        sbLIZ8.append("Unknown enum default value: \"");
                        sbLIZ8.append(this.LLILLL.getDefaultValue());
                        sbLIZ8.append('\"');
                        throw new C19939612zy(this, C2188811AlT.LIZIZ(sbLIZ8));
                    }
                    return;
                default:
                    return;
            }
        } catch (NumberFormatException e2) {
            TryCatchGuardChecker.doCheck(e2);
            StringBuilder sbLIZ9 = C2188811AlT.LIZ();
            sbLIZ9.append("Could not parse default value: \"");
            sbLIZ9.append(this.LLILLL.getDefaultValue());
            sbLIZ9.append('\"');
            throw new C19939612zy(this, C2188811AlT.LIZIZ(sbLIZ9), e2);
        }
        TryCatchGuardChecker.doCheck(e2);
        StringBuilder sbLIZ92 = C2188811AlT.LIZ();
        sbLIZ92.append("Could not parse default value: \"");
        sbLIZ92.append(this.LLILLL.getDefaultValue());
        sbLIZ92.append('\"');
        throw new C19939612zy(this, C2188811AlT.LIZIZ(sbLIZ92), e2);
    }

    public final C131Y LJJ() {
        if (this.LLILZ == null) {
            C131Y options = this.LLILLL.getOptions();
            if (options.hasFeatures()) {
                C131Z builder = options.toBuilder();
                builder.LLILZLL &= -2049;
                builder.LLJJIJIIJIL = null;
                C130N<C199437131n, C199436131m, AnonymousClass1326> c130n = builder.LLJJIJIL;
                if (c130n != null) {
                    c130n.LIZ = null;
                    builder.LLJJIJIL = null;
                }
                builder.LJIILLIIL();
                options = builder.buildPartial();
                if (!options.isInitialized()) {
                    throw AbstractC19931812yi.LJI(options);
                }
            }
            synchronized (this) {
                try {
                    if (this.LLILZ == null) {
                        this.LLILZ = options;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return this.LLILZ;
    }

    public final EnumC19937712zf LJJI() {
        AbstractC19939512zx abstractC19939512zx;
        AnonymousClass1301 anonymousClass1301;
        return (this.LLJI != EnumC19937712zf.MESSAGE || ((abstractC19939512zx = this.LLJILJILJ) != null && ((AnonymousClass1301) abstractC19939512zx).LLILLJJLI.getOptions().getMapEntry()) || (((anonymousClass1301 = this.LLJIJIL) != null && anonymousClass1301.LLILLJJLI.getOptions().getMapEntry()) || this.LL == null || LJFF().getMessageEncoding() != EnumC199399130b.DELIMITED)) ? this.LLJI : EnumC19937712zf.GROUP;
    }

    public final boolean LJJIII() {
        return this.LLILLL.hasExtendee();
    }

    public final boolean LJJIIZ() {
        return this.LLILLL.getLabel() == C130F.LABEL_OPTIONAL && LJFF().getFieldPresence() != C130Z.LEGACY_REQUIRED;
    }

    @Override // X.InterfaceC19930212yS
    public final AnonymousClass1334 LJJIJL() {
        return LLJJI[LJJI().ordinal()];
    }

    @Override // X.InterfaceC19930212yS
    public final boolean LJJLJ() {
        return this.LLILLL.getLabel() == C130F.LABEL_REPEATED;
    }

    @Override // X.InterfaceC19930212yS
    public final int getNumber() {
        return this.LLILLL.getNumber();
    }

    @Override // X.AbstractC19939512zx
    public final C199437131n LJIIJJI() {
        C199436131m c199436131mNewBuilder;
        if (LJI().LJIIZILJ().getNumber() >= C130B.EDITION_2023.getNumber()) {
            return C199437131n.getDefaultInstance();
        }
        if (this.LLILLL.getLabel() == C130F.LABEL_REQUIRED) {
            c199436131mNewBuilder = C199437131n.newBuilder();
            C130Z c130z = C130Z.LEGACY_REQUIRED;
            c199436131mNewBuilder.getClass();
            c130z.getClass();
            c199436131mNewBuilder.LLILZLL |= 1;
            c199436131mNewBuilder.LLIZ = c130z.getNumber();
            c199436131mNewBuilder.LJIILLIIL();
        } else {
            c199436131mNewBuilder = null;
        }
        if (this.LLILLL.getType() == C130D.TYPE_GROUP) {
            if (c199436131mNewBuilder == null) {
                c199436131mNewBuilder = C199437131n.newBuilder();
            }
            EnumC199399130b enumC199399130b = EnumC199399130b.DELIMITED;
            c199436131mNewBuilder.getClass();
            enumC199399130b.getClass();
            c199436131mNewBuilder.LLILZLL |= 16;
            c199436131mNewBuilder.LLJIJIL = enumC199399130b.getNumber();
            c199436131mNewBuilder.LJIILLIIL();
        }
        if (LJI().LJIIZILJ() == C130B.EDITION_PROTO2 && this.LLILLL.getOptions().getPacked()) {
            if (c199436131mNewBuilder == null) {
                c199436131mNewBuilder = C199437131n.newBuilder();
            }
            c199436131mNewBuilder.LJJIIZ(C131R.PACKED);
        }
        if (LJI().LJIIZILJ() == C130B.EDITION_PROTO3 && this.LLILLL.getOptions().hasPacked() && !this.LLILLL.getOptions().getPacked()) {
            if (c199436131mNewBuilder == null) {
                c199436131mNewBuilder = C199437131n.newBuilder();
            }
            c199436131mNewBuilder.LJJIIZ(C131R.EXPANDED);
        } else if (c199436131mNewBuilder == null) {
            return C199437131n.getDefaultInstance();
        }
        return c199436131mNewBuilder.build();
    }

    public final Object LJIIZILJ() {
        if (LJIJJ() != EnumC19937812zg.MESSAGE) {
            return this.LLJILLL;
        }
        throw new UnsupportedOperationException("FieldDescriptor.getDefaultValue() called on an embedded message field.");
    }

    public final C199422130y LJIJ() {
        if (LJIJJ() == EnumC19937812zg.ENUM) {
            return (C199422130y) this.LLJILJILJ;
        }
        throw new UnsupportedOperationException(C786410Ut5.j4("This field is not of enum type. (%s)", new Object[]{this.LLILZIL}));
    }

    public final AnonymousClass1301 LJIJI() {
        if (LJJIII()) {
            return this.LLIZ;
        }
        throw new UnsupportedOperationException(C786410Ut5.j4("This field is not an extension. (%s)", new Object[]{this.LLILZIL}));
    }

    public final EnumC19937812zg LJIJJ() {
        return LJJI().getJavaType();
    }

    public final AnonymousClass1301 LJIJJLI() {
        if (LJIJJ() == EnumC19937812zg.MESSAGE) {
            return (AnonymousClass1301) this.LLJILJILJ;
        }
        throw new UnsupportedOperationException(C786410Ut5.j4("This field is not of message type. (%s)", new Object[]{this.LLILZIL}));
    }

    public final boolean LJJII() {
        if (LJJLJ()) {
            return false;
        }
        return this.LLIZLLLIL || LJJI() == EnumC19937712zf.MESSAGE || LJJI() == EnumC19937712zf.GROUP || LJJIII() || this.LLJILJIL != null || LJFF().getFieldPresence() != C130Z.IMPLICIT;
    }

    public final boolean LJJIIJ() {
        return LJJI() == EnumC19937712zf.MESSAGE && LJJLJ() && LJIJJLI().LLILLJJLI.getOptions().getMapEntry();
    }

    public final boolean LJJIIZI() {
        return LJJLJ() && LJJIJL().isPackable();
    }

    public final boolean LJJIJ() {
        return LJFF().getFieldPresence() == C130Z.LEGACY_REQUIRED;
    }

    public final boolean LJJIJIIJI() {
        if (Collections.unmodifiableList(Arrays.asList(LJI().LLIZ)).isEmpty()) {
            return LJJI() == EnumC19937712zf.ENUM && LJIJ().LJFF().getEnumType() == EnumC199438131o.CLOSED;
        }
        if (LJJI() == EnumC19937712zf.ENUM) {
            return ((C130Q) LJFF().getExtension((C19933612z0) AnonymousClass1307.LIZ)).getLegacyClosedEnum() || LJIJ().LJFF().getEnumType() == EnumC199438131o.CLOSED;
        }
        return false;
    }

    public final boolean LJJIJIIJIL() {
        if (LJJI() != EnumC19937712zf.STRING) {
            return false;
        }
        if (this.LLJIJIL.LLILLJJLI.getOptions().getMapEntry() || ((C130Q) LJFF().getExtension((C19933612z0) AnonymousClass1307.LIZ)).getUtf8Validation().equals(C130O.VERIFY)) {
            return true;
        }
        return LJFF().getUtf8Validation().equals(C130X.VERIFY);
    }

    @Override // X.InterfaceC19930212yS
    public final AnonymousClass1332 LJJJIL() {
        return LJJIJL().getJavaType();
    }

    @Override // X.InterfaceC19930212yS
    public final boolean isPacked() {
        if (LJJIIZI()) {
            return LJFF().getRepeatedFieldEncoding().equals(C131R.PACKED);
        }
        return false;
    }

    @Override // X.AbstractC19939512zx
    public final String LJII() {
        return this.LLILZIL;
    }

    @Override // X.AbstractC19939512zx
    public final AbstractC19939512zx LJIIJ() {
        return this.LLILZLL;
    }

    @Override // X.AbstractC19939512zx
    public final /* bridge */ /* synthetic */ InterfaceC19930912yZ LJIILJJIL() {
        return this.LLILLL;
    }

    public final String toString() {
        return this.LLILZIL;
    }

    @Override // X.InterfaceC19930212yS
    public final boolean LJJJJLI(Object obj) {
        return obj instanceof InterfaceC19925612xi;
    }

    @Override // java.lang.Comparable
    public final int compareTo(C19939112zt c19939112zt) {
        C19939112zt c19939112zt2 = c19939112zt;
        if (c19939112zt2.LLJIJIL == this.LLJIJIL) {
            return getNumber() - c19939112zt2.getNumber();
        }
        throw new IllegalArgumentException("FieldDescriptors can only be compared to other FieldDescriptors for fields of the same message type.");
    }

    public static C19935112zF LJJIIJZLJL(C19939112zt c19939112zt, Object obj) {
        if (c19939112zt.LJJI() == EnumC19937712zf.ENUM) {
            if (c19939112zt.LJJLJ()) {
                Iterator it2 = ((List) obj).iterator();
                while (it2.hasNext()) {
                    if (((C199423130z) it2.next()).LJIILLIIL().getDebugRedact()) {
                        return C19935112zF.LIZ(true, false);
                    }
                }
            } else if (((C199423130z) obj).LJIILLIIL().getDebugRedact()) {
                return C19935112zF.LIZ(true, false);
            }
        } else if (c19939112zt.LJIJJ() == EnumC19937812zg.MESSAGE) {
            if (c19939112zt.LJJLJ()) {
                Iterator it3 = ((List) obj).iterator();
                while (it3.hasNext()) {
                    for (Map.Entry<C19939112zt, Object> entry : ((InterfaceC19933112yv) it3.next()).getAllFields().entrySet()) {
                        C19935112zF c19935112zFLJJIIJZLJL = LJJIIJZLJL(entry.getKey(), entry.getValue());
                        if (c19935112zFLJJIIJZLJL.LIZ) {
                            return c19935112zFLJJIIJZLJL;
                        }
                    }
                }
            } else {
                for (Map.Entry<C19939112zt, Object> entry2 : ((InterfaceC19933112yv) obj).getAllFields().entrySet()) {
                    C19935112zF c19935112zFLJJIIJZLJL2 = LJJIIJZLJL(entry2.getKey(), entry2.getValue());
                    if (c19935112zFLJJIIJZLJL2.LIZ) {
                        return c19935112zFLJJIIJZLJL2;
                    }
                }
            }
        }
        return C19935112zF.LIZ(false, false);
    }

    @Override // X.InterfaceC19930212yS
    public final void LJJIFFI(Object obj, Object obj2) {
        ((InterfaceC19931912yj) obj).LJJIL((InterfaceC19930912yZ) obj2);
    }

    public C19939112zt(C199412130o c199412130o, AnonymousClass1302 anonymousClass1302, AnonymousClass1301 anonymousClass1301, int i, boolean z) throws C19939612zy {
        this.LLILLJJLI = i;
        this.LLILLL = c199412130o;
        this.LLILZIL = AnonymousClass1303.LIZIZ(anonymousClass1302, anonymousClass1301, c199412130o.getName());
        if (c199412130o.hasType()) {
            this.LLJI = EnumC19937712zf.valueOf(c199412130o.getType());
        }
        this.LLIZLLLIL = c199412130o.getProto3Optional();
        if (getNumber() > 0) {
            if (z) {
                if (c199412130o.hasExtendee()) {
                    this.LLJIJIL = null;
                    if (anonymousClass1301 != null) {
                        this.LLIZ = anonymousClass1301;
                        this.LLILZLL = anonymousClass1301;
                    } else {
                        this.LLIZ = null;
                        Charset charset = C19922012x8.LIZ;
                        anonymousClass1302.getClass();
                        this.LLILZLL = anonymousClass1302;
                    }
                    if (!c199412130o.hasOneofIndex()) {
                        this.LLJILJIL = null;
                    } else {
                        throw new C19939612zy(this, "FieldDescriptorProto.oneof_index set for extension field.");
                    }
                } else {
                    throw new C19939612zy(this, "FieldDescriptorProto.extendee not set for extension field.");
                }
            } else if (!c199412130o.hasExtendee()) {
                this.LLJIJIL = anonymousClass1301;
                if (c199412130o.hasOneofIndex()) {
                    if (c199412130o.getOneofIndex() >= 0 && c199412130o.getOneofIndex() < anonymousClass1301.LLILLJJLI.getOneofDeclCount()) {
                        C19939212zu c19939212zu = (C19939212zu) ListProtector.get(Collections.unmodifiableList(Arrays.asList(anonymousClass1301.LLJIJIL)), c199412130o.getOneofIndex());
                        this.LLJILJIL = c19939212zu;
                        c19939212zu.LLILZLL++;
                        Charset charset2 = C19922012x8.LIZ;
                        this.LLILZLL = c19939212zu;
                    } else {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("FieldDescriptorProto.oneof_index is out of range for type ");
                        sbLIZ.append(anonymousClass1301.LJIIIZ());
                        throw new C19939612zy(this, C2188811AlT.LIZIZ(sbLIZ));
                    }
                } else {
                    this.LLJILJIL = null;
                    Charset charset3 = C19922012x8.LIZ;
                    anonymousClass1301.getClass();
                    this.LLILZLL = anonymousClass1301;
                }
                this.LLIZ = null;
            } else {
                throw new C19939612zy(this, "FieldDescriptorProto.extendee set for non-extension field.");
            }
            anonymousClass1302.LLJ.LIZIZ(this);
            return;
        }
        throw new C19939612zy(this, "Field numbers must be positive integers.");
    }
}
