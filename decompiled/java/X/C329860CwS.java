package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.reviewaggregation.repo.UserContent;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0CwS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C329860CwS {
    public static final /* synthetic */ C329860CwS LIZ = new C329860CwS();

    public static InterfaceC329670Cw9 LIZ(UserContent userContent) {
        List<Aweme> list;
        final Aweme aweme;
        final boolean z;
        String str;
        Long l;
        Integer num;
        final String str2 = userContent.text;
        if (str2 == null || (list = userContent.subVideoList) == null || (aweme = (Aweme) C13LP.LJJJLL(list)) == null) {
            return null;
        }
        if (C301390Brd.LIZ() && (num = userContent.showSourceStyle) != null && num.intValue() == -1) {
            z = false;
        } else {
            z = true;
        }
        UserContent.SourceType sourceType = userContent.sourceType;
        if (sourceType != null) {
            int i = C329870CwT.LIZ[sourceType.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        UrlModel urlModel = userContent.userCoverUrl;
                        if (urlModel != null && (str = userContent.userName) != null && (l = userContent.popularity) != null) {
                            long jLongValue = l.longValue();
                            Long l2 = userContent.cid;
                            if (l2 != null) {
                                return new C329890CwV(str2, aweme, userContent.keyMoment, z, urlModel, str, jLongValue, l2.longValue());
                            }
                        }
                        return null;
                    }
                } else {
                    final Long l3 = userContent.keyMoment;
                    return new InterfaceC329670Cw9(str2, aweme, l3, z) { // from class: X.0CwQ
                        public final String LIZIZ;
                        public final Aweme LIZJ;
                        public final Long LIZLLL;
                        public final boolean LJ;

                        public final boolean equals(Object obj) {
                            if (this == obj) {
                                return true;
                            }
                            if (!(obj instanceof C329840CwQ)) {
                                return false;
                            }
                            C329840CwQ c329840CwQ = (C329840CwQ) obj;
                            return Intrinsics.LJFF(this.LIZIZ, c329840CwQ.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c329840CwQ.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c329840CwQ.LIZLLL) && this.LJ == c329840CwQ.LJ;
                        }

                        public final int hashCode() {
                            int iHashCode = ((this.LIZIZ.hashCode() * 31) + this.LIZJ.hashCode()) * 31;
                            Long l4 = this.LIZLLL;
                            return ((iHashCode + (l4 == null ? 0 : l4.hashCode())) * 31) + C786410Ut5.Z2(this.LJ);
                        }

                        public final String toString() {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("PhotoTextItem(text=");
                            sbLIZ.append(this.LIZIZ);
                            sbLIZ.append(", aweme=");
                            sbLIZ.append(this.LIZJ);
                            sbLIZ.append(", keyMoment=");
                            sbLIZ.append(this.LIZLLL);
                            sbLIZ.append(", showSourceText=");
                            sbLIZ.append(this.LJ);
                            sbLIZ.append(')');
                            return C2188811AlT.LIZIZ(sbLIZ);
                        }

                        @Override // X.InterfaceC329670Cw9
                        public final Long LIZ() {
                            return this.LIZLLL;
                        }

                        @Override // X.InterfaceC329670Cw9
                        public final boolean LIZIZ() {
                            return this.LJ;
                        }

                        @Override // X.InterfaceC329670Cw9
                        public final Aweme getAweme() {
                            return this.LIZJ;
                        }

                        @Override // X.InterfaceC329670Cw9
                        public final String getText() {
                            return this.LIZIZ;
                        }

                        {
                            this.LIZIZ = str2;
                            this.LIZJ = aweme;
                            this.LIZLLL = l3;
                            this.LJ = z;
                        }
                    };
                }
            } else {
                final Long l4 = userContent.keyMoment;
                return new InterfaceC329670Cw9(str2, aweme, l4, z) { // from class: X.0CwR
                    public final String LIZIZ;
                    public final Aweme LIZJ;
                    public final Long LIZLLL;
                    public final boolean LJ;

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof C329850CwR)) {
                            return false;
                        }
                        C329850CwR c329850CwR = (C329850CwR) obj;
                        return Intrinsics.LJFF(this.LIZIZ, c329850CwR.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c329850CwR.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c329850CwR.LIZLLL) && this.LJ == c329850CwR.LJ;
                    }

                    public final int hashCode() {
                        int iHashCode = ((this.LIZIZ.hashCode() * 31) + this.LIZJ.hashCode()) * 31;
                        Long l5 = this.LIZLLL;
                        return ((iHashCode + (l5 == null ? 0 : l5.hashCode())) * 31) + C786410Ut5.Z2(this.LJ);
                    }

                    public final String toString() {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("VideoItem(text=");
                        sbLIZ.append(this.LIZIZ);
                        sbLIZ.append(", aweme=");
                        sbLIZ.append(this.LIZJ);
                        sbLIZ.append(", keyMoment=");
                        sbLIZ.append(this.LIZLLL);
                        sbLIZ.append(", showSourceText=");
                        sbLIZ.append(this.LJ);
                        sbLIZ.append(')');
                        return C2188811AlT.LIZIZ(sbLIZ);
                    }

                    @Override // X.InterfaceC329670Cw9
                    public final Long LIZ() {
                        return this.LIZLLL;
                    }

                    @Override // X.InterfaceC329670Cw9
                    public final boolean LIZIZ() {
                        return this.LJ;
                    }

                    @Override // X.InterfaceC329670Cw9
                    public final Aweme getAweme() {
                        return this.LIZJ;
                    }

                    @Override // X.InterfaceC329670Cw9
                    public final String getText() {
                        return this.LIZIZ;
                    }

                    {
                        this.LIZIZ = str2;
                        this.LIZJ = aweme;
                        this.LIZLLL = l4;
                        this.LJ = z;
                    }
                };
            }
        }
        final Long l5 = userContent.keyMoment;
        return new InterfaceC329670Cw9(str2, aweme, l5, z) { // from class: X.0CwR
            public final String LIZIZ;
            public final Aweme LIZJ;
            public final Long LIZLLL;
            public final boolean LJ;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C329850CwR)) {
                    return false;
                }
                C329850CwR c329850CwR = (C329850CwR) obj;
                return Intrinsics.LJFF(this.LIZIZ, c329850CwR.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c329850CwR.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c329850CwR.LIZLLL) && this.LJ == c329850CwR.LJ;
            }

            public final int hashCode() {
                int iHashCode = ((this.LIZIZ.hashCode() * 31) + this.LIZJ.hashCode()) * 31;
                Long l52 = this.LIZLLL;
                return ((iHashCode + (l52 == null ? 0 : l52.hashCode())) * 31) + C786410Ut5.Z2(this.LJ);
            }

            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("VideoItem(text=");
                sbLIZ.append(this.LIZIZ);
                sbLIZ.append(", aweme=");
                sbLIZ.append(this.LIZJ);
                sbLIZ.append(", keyMoment=");
                sbLIZ.append(this.LIZLLL);
                sbLIZ.append(", showSourceText=");
                sbLIZ.append(this.LJ);
                sbLIZ.append(')');
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            @Override // X.InterfaceC329670Cw9
            public final Long LIZ() {
                return this.LIZLLL;
            }

            @Override // X.InterfaceC329670Cw9
            public final boolean LIZIZ() {
                return this.LJ;
            }

            @Override // X.InterfaceC329670Cw9
            public final Aweme getAweme() {
                return this.LIZJ;
            }

            @Override // X.InterfaceC329670Cw9
            public final String getText() {
                return this.LIZIZ;
            }

            {
                this.LIZIZ = str2;
                this.LIZJ = aweme;
                this.LIZLLL = l5;
                this.LJ = z;
            }
        };
    }
}
