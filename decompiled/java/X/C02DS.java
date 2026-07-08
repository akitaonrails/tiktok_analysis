package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02DS, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02DS extends Message<C02DS, C568702Jp> {
    public static final ProtoAdapter<C02DS> ADAPTER = new ProtoAdapter<C02DS>() { // from class: X.026H
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02DS decode(ProtoReader protoReader) {
            C02DS c02ds = new C02DS();
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
                                        c02ds.extra = ProtoAdapter.STRING.decode(protoReader);
                                    }
                                } else {
                                    c02ds.anchor_related = C02VL.ADAPTER.decode(protoReader);
                                }
                            } else {
                                c02ds.asset_type = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c02ds.resource_id = ProtoAdapter.INT64.decode(protoReader);
                        }
                    } else {
                        c02ds.asset_id = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02ds;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02DS c02ds) {
            C02DS c02ds2 = c02ds;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c02ds2.asset_id) + protoAdapter.encodedSizeWithTag(2, c02ds2.resource_id);
            ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
            return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(3, c02ds2.asset_type) + C02VL.ADAPTER.encodedSizeWithTag(4, c02ds2.anchor_related) + protoAdapter2.encodedSizeWithTag(5, c02ds2.extra) + c02ds2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C02DS c02ds) {
            C02DS c02ds2 = c02ds;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            protoAdapter.encodeWithTag(protoWriter, 1, c02ds2.asset_id);
            protoAdapter.encodeWithTag(protoWriter, 2, c02ds2.resource_id);
            ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
            protoAdapter2.encodeWithTag(protoWriter, 3, c02ds2.asset_type);
            C02VL.ADAPTER.encodeWithTag(protoWriter, 4, c02ds2.anchor_related);
            protoAdapter2.encodeWithTag(protoWriter, 5, c02ds2.extra);
            protoWriter.writeBytes(c02ds2.unknownFields());
        }
    };
    public C02VL anchor_related;
    public Long asset_id;
    public String asset_type;
    public String extra;
    public Long resource_id;

    public C02DS() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C568702Jp newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
