package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CCK, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CCK extends Message<C1CCK, C1CCL> {
    public static final ProtoAdapter<C1CCK> ADAPTER = new ProtoAdapter<C1CCK>() { // from class: X.1CCJ
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CCK decode(ProtoReader protoReader) {
            C1CCK c1cck = new C1CCK();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 4) {
                                    if (iNextTag != 5) {
                                        protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                                    } else {
                                        c1cck.non_asset_info.add(C1CCH.ADAPTER.decode(protoReader));
                                    }
                                } else {
                                    c1cck.asset_info.add(C1CCH.ADAPTER.decode(protoReader));
                                }
                            } else {
                                c1cck.non_asset = C1CCH.ADAPTER.decode(protoReader);
                            }
                        } else {
                            c1cck.asset = C1CCH.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c1cck.is_ai = ProtoAdapter.BOOL.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1cck;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1CCK c1cck) {
            C1CCK c1cck2 = c1cck;
            int iEncodedSizeWithTag = ProtoAdapter.BOOL.encodedSizeWithTag(1, c1cck2.is_ai);
            ProtoAdapter<C1CCH> protoAdapter = C1CCH.ADAPTER;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(2, c1cck2.asset) + protoAdapter.encodedSizeWithTag(3, c1cck2.non_asset) + protoAdapter.asRepeated().encodedSizeWithTag(4, c1cck2.asset_info) + protoAdapter.asRepeated().encodedSizeWithTag(5, c1cck2.non_asset_info) + c1cck2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1CCK c1cck) {
            C1CCK c1cck2 = c1cck;
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, c1cck2.is_ai);
            ProtoAdapter<C1CCH> protoAdapter = C1CCH.ADAPTER;
            protoAdapter.encodeWithTag(protoWriter, 2, c1cck2.asset);
            protoAdapter.encodeWithTag(protoWriter, 3, c1cck2.non_asset);
            protoAdapter.asRepeated().encodeWithTag(protoWriter, 4, c1cck2.asset_info);
            protoAdapter.asRepeated().encodeWithTag(protoWriter, 5, c1cck2.non_asset_info);
            protoWriter.writeBytes(c1cck2.unknownFields());
        }
    };
    public C1CCH asset;
    public List<C1CCH> asset_info;
    public Boolean is_ai;
    public C1CCH non_asset;
    public List<C1CCH> non_asset_info;

    public C1CCK() {
        super(ADAPTER, ByteString.EMPTY);
        this.asset_info = C1516540pZE.LJIIIIZZ();
        this.non_asset_info = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C1CCL newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
