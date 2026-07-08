package X;

import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: X.0gnk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1179580gnk implements Serializable {
    public final String address;
    public final double defaultZoomLevel;
    public final boolean disableInteraction;
    public final boolean disableSingleFingerMove;
    public final String enterFrom;
    public final double maxLat;
    public final double maxLng;
    public final double maxUIZoomLevel;
    public final double minLat;
    public final double minLng;
    public final double minUIZoomLevel;
    public final String poiId;
    public final double poiLat;
    public final double poiLng;
    public final List<C1177960gl8> poiMarkers;

    public C1179580gnk(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9, boolean z, String str, String str2, String str3, List<C1177960gl8> list, boolean z2) {
        this.poiLat = d;
        this.poiLng = d2;
        this.defaultZoomLevel = d3;
        this.maxLat = d4;
        this.minLat = d5;
        this.maxLng = d6;
        this.minLng = d7;
        this.minUIZoomLevel = d8;
        this.maxUIZoomLevel = d9;
        this.disableInteraction = z;
        this.poiId = str;
        this.enterFrom = str2;
        this.address = str3;
        this.poiMarkers = list;
        this.disableSingleFingerMove = z2;
    }

    public C1179580gnk(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9, boolean z, String str, String str2, String str3, List list, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(d, d2, d3, d4, d5, d6, d7, d8, d9, z, str, str2, str3, (i & 8192) != 0 ? C13BV.INSTANCE : list, z2);
    }
}
